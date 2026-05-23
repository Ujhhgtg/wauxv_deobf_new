#!/usr/bin/env -S uv run --script

# /// script
# dependencies = ["pyperclip"]
# ///

import argparse
import re
import sys
from pathlib import Path

import pyperclip

# --- Precision Helpers ---


def to_int64(n):
    n &= 0xFFFFFFFFFFFFFFFF
    return n - 0x10000000000000000 if n >= 0x8000000000000000 else n


def to_int32(n):
    n &= 0xFFFFFFFF
    return n - 0x100000000 if n >= 0x80000000 else n


def to_int16(n):
    n &= 0xFFFF
    return n - 0x10000 if n >= 0x8000 else n


def l_ushr(n, shift):
    """Java >>> for 64-bit longs"""
    return (n & 0xFFFFFFFFFFFFFFFF) >> (shift & 63)


def i_ushr(n, shift):
    """Java >>> for 32-bit ints (used when shorts are promoted)"""
    return (n & 0xFFFFFFFF) >> (shift & 31)


def l_mul(a, b):
    """Java long multiplication overflow"""
    return to_int64(a * b)


# --- Fixed Logic ---


def ab(j):
    # Java extracts shorts (signed 16-bit)
    s = to_int16(j & 0xFFFF)
    s2 = to_int16(l_ushr(j, 16) & 0xFFFF)

    s3 = to_int16(s + s2)
    s4 = to_int16(s2 ^ s)

    # Part A (Bits 16-31): (short) ((s4 >>> 22) | (s4 << 10))
    part_a = to_int16(i_ushr(s4, 22) | (s4 << 10))

    # Part B (Bits 32-47): (short) (((short) ((s3 >>> 23) | (s3 << 9))) + s)
    part_b = to_int16(to_int16(i_ushr(s3, 23) | (s3 << 9)) + s)

    # Part C (Bits 0-15): (short) (((short) (((short) ((s << 13) | (s >>> 19))) ^ s4)) ^ (s4 << 5))
    term_c = to_int16(i_ushr(s, 19) | (s << 13))
    part_c = to_int16(to_int16(term_c ^ s4) ^ (s4 << 5))

    # CRITICAL: Java Assembly with Sign Extension
    # Java: ((((long) A) | (((long) B) << 16)) << 16) | ((long) C)
    # We use to_int64() on the shorts to mimic Java's sign extension
    val = to_int64(to_int64(part_a) | (to_int64(part_b) << 16))
    res = to_int64((val << 16) | to_int64(part_c))

    return res


def decrypt(j2, string_array):
    j2 = to_int64(j2)
    j3 = j2 & 0xFFFFFFFF

    # j3 is unsigned 32-bit, so j3 >>> 33 is always 0 in Java
    j4 = l_mul(j3, 7109453100751455733)

    # Second mix
    j_mix = l_mul((j4 ^ l_ushr(j4, 28)), -3808689974395783757)
    jAb = ab(l_ushr(j_mix, 32))

    j5 = l_ushr(jAb, 32) & 0xFFFF
    jAb2 = ab(jAb)

    # Calculate index i2
    # The mask -65536 in Java (int) promoted to long is 0xFFFFFFFFFFFF0000
    i2 = to_int32((l_ushr(j2, 32) ^ j5) ^ (l_ushr(jAb2, 16) & 0xFFFFFFFFFFFF0000))

    jAb3 = ab(jAb2)

    # Java-style truncated division
    def get_char(idx):
        row = int(idx / 8191)
        col = int(idx % 8191)
        return ord(string_array[row][col])

    try:
        jCharAt = jAb3 ^ (get_char(i2) << 32)
        length = int(l_ushr(jCharAt, 32) & 0xFFFF)

        result = []
        for i in range(length):
            idx = i2 + i + 1
            jCharAt = to_int64(ab(jCharAt) ^ (get_char(idx) << 32))
            decrypted_char = int(l_ushr(jCharAt, 32) & 0xFFFF)
            result.append(chr(decrypted_char))

        return "".join(result)
    except Exception as e:
        return f"[DECRYPT_ERROR: {e}]"


# --- File Operations ---


def parse_string_array(src_path: Path, array_name: str) -> list[str]:
    """
    Parse the string array from ?.java line

    Args:
        src_path: Path to ?.java file

    Returns:
        List of strings from the array
    """
    with open(src_path, "r", encoding="utf-8") as f:
        content = f.read()

    # Find the string array declaration: public static final String[] i = {...}
    pattern = r"public\s+static\s+final\s+String\[\]\s+ARRAY_NAME\s*=\s*\{([^}]+)\}"
    pattern = pattern.replace("ARRAY_NAME", array_name)
    match = re.search(pattern, content, re.DOTALL)

    if not match:
        raise ValueError(f"Could not find string array '{array_name}' in {src_path}")

    array_content = match.group(1)

    # Extract individual strings
    # They are in format: "string1", "string2", ...
    strings = []
    string_pattern = r'"([^"\\]*(?:\\.[^"\\]*)*)"'

    for match in re.finditer(string_pattern, array_content):
        string_val = match.group(1)
        # Unescape Java string escapes
        string_val = string_val.encode("utf-8", errors="surrogateescape").decode(
            "unicode_escape"
        )
        strings.append(string_val)

    return strings


def find_crypt_calls(java_content, call_name):
    """
    Find all decrypt calls in Java content, supporting decimal and hex
    """
    # Updated pattern: matches optional minus, then either 0x... or standard digits.
    # It also handles the 'L' or 'l' suffix flexibly.
    # Supports optional second argument: (long, ClassName.fieldName) or (long, strArr)
    pattern = call_name + r"\((-?(?:0x[0-9a-fA-F]+|\d+))[Ll]?(?:\s*,\s*(?:strArr\d*|[A-Za-z_$][\w$]*\.[A-Za-z_$][\w$]*))?\)"

    matches = []
    for match in re.finditer(pattern, java_content):
        long_str = match.group(1)

        try:
            # Using base 0 tells Python to automatically detect the base:
            # '0x...' becomes hex, '123' becomes decimal.
            long_val = int(long_str, 0)
            matches.append((match, long_val))
        except ValueError:
            print(f"  Warning: Could not parse integer value: {long_str}")

    return matches


def deobfuscate_file(java_path: Path, string_array, call_name: str):
    """
    Deobfuscate a single Java file by inlining decryption calls

    Args:
        java_path: Path to Java file
        string_array: Decryption string array

    Returns:
        Number of replacements made
    """
    with open(java_path, "r", encoding="utf-8") as f:
        content = f.read()

    # Find both types of calls
    dec_matches = find_crypt_calls(content, call_name)

    if not dec_matches:
        return 0

    # Combine and sort by position (reverse order for replacement)
    all_matches = []
    for match, long_val in dec_matches:
        all_matches.append((match, long_val))

    all_matches.sort(key=lambda x: x[0].start(), reverse=True)

    replacements = 0
    for match, long_val in all_matches:
        try:
            decrypted = decrypt(long_val, string_array)

            # Escape special characters for Java string
            decrypted_escaped = (
                decrypted.replace("\\", "\\\\")
                .replace('"', '\\"')
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t")
            )

            original_call = match.group(0)

            replacement = '"' + decrypted_escaped + '"'

            # Replace in content
            start, end = match.span()
            content = content[:start] + replacement + content[end:]

            replacements += 1
            print(f'  {original_call} -> "{decrypted}"')

        except Exception as e:
            print(f"  ERROR decrypting {match.group(0)}: {e}")

    # Write back if changes were made
    if replacements > 0:
        try:
            with open(java_path, "w", encoding="utf-8", errors="surrogateescape") as f:
                f.write(content)
        except Exception as e:
            print(f"  ERROR writing decrypted value to {java_path}: {e}")

    return replacements


# --- CLI Implementation ---


def main():
    parser = argparse.ArgumentParser(
        description="Deobfuscate Java strings or decrypt a single long value."
    )
    subparsers = parser.add_subparsers(dest="command", help="Mode of operation")

    # Bulk Mode
    bulk_parser = subparsers.add_parser(
        "bulk", help="Deobfuscate all files in a directory"
    )
    bulk_parser.add_argument(
        "directory", type=Path, help="Directory containing .java files to process"
    )
    bulk_parser.add_argument(
        "crypt_path",
        type=Path,
        help="Path to the Java file containing the string array",
    )
    bulk_parser.add_argument(
        "call_name", help="The name of the decryption method (e.g., 'cnb.z')"
    )
    bulk_parser.add_argument(
        "array_name", help="The name of the String array in the crypt class"
    )

    # Single Mode
    single_parser = subparsers.add_parser("single", help="Decrypt a single long value")
    single_parser.add_argument(
        "value", help="The long value to decrypt (supports hex 0x...)"
    )
    single_parser.add_argument(
        "crypt_path",
        type=Path,
        help="Path to the Java file containing the string array",
    )
    single_parser.add_argument(
        "array_name", help="The name of the String array in the crypt class"
    )

    args = parser.parse_args()

    if not args.command:
        parser.print_help()
        return

    # Load String Array (Shared Logic)
    if not args.crypt_path.exists():
        print(f"Error: Crypt class path {args.crypt_path} does not exist.")
        sys.exit(1)

    print(f"Loading string array '{args.array_name}' from {args.crypt_path}...")
    try:
        string_array = parse_string_array(args.crypt_path, args.array_name)
        print(f"Loaded {len(string_array)} strings.")
    except Exception as e:
        print(f"Error: {e}")
        sys.exit(1)

    if args.command == "single":
        try:
            val = int(args.value.rstrip("Ll"), 0)
            result = decrypt(val, string_array)
            print(f'\nDecrypted and copied to clipboard: "{result}"')
            pyperclip.copy(f'"{result}"')
        except ValueError:
            print(f"Error: '{args.value}' is not a valid integer.")

    elif args.command == "bulk":
        java_files = list(args.directory.rglob("*.java"))
        print(f"Scanning {len(java_files)} files...")

        total_reps = 0
        for f in java_files:
            print(f"Processing {f.name}...")
            total_reps += deobfuscate_file(f, string_array, args.call_name)

        print(f"\nFinished. Total replacements: {total_reps}")


if __name__ == "__main__":
    main()
