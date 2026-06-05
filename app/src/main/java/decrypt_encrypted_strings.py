#!/usr/bin/env -S uv run --script

# /// script
# dependencies = ["pyperclip"]
# ///

import argparse
import re
import sys
import urllib.error
import urllib.request
from pathlib import Path

import pyperclip  # ty:ignore[unresolved-import]

# ============================================================
# Precision Helpers (Java int/long semantics)
# ============================================================


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


# ============================================================
# Version 1: Old algorithm (works for old/ version B)
# ============================================================


def ab(j):
    """Feistel-like mixing function from the original Java implementation."""
    s = to_int16(j & 0xFFFF)
    s2 = to_int16(l_ushr(j, 16) & 0xFFFF)

    s3 = to_int16(s + s2)
    s4 = to_int16(s2 ^ s)

    part_a = to_int16(i_ushr(s4, 22) | (s4 << 10))
    part_b = to_int16(to_int16(i_ushr(s3, 23) | (s3 << 9)) + s)
    term_c = to_int16(i_ushr(s, 19) | (s << 13))
    part_c = to_int16(to_int16(term_c ^ s4) ^ (s4 << 5))

    val = to_int64(to_int64(part_a) | (to_int64(part_b) << 16))
    res = to_int64((val << 16) | to_int64(part_c))
    return res


def decrypt_v1(j2, string_array):
    """Original decrypt algorithm (version B / old/)."""
    j2 = to_int64(j2)
    j3 = j2 & 0xFFFFFFFF

    j4 = l_mul(j3, 7109453100751455733)
    j_mix = l_mul((j4 ^ l_ushr(j4, 28)), -3808689974395783757)
    jAb = ab(l_ushr(j_mix, 32))

    j5 = l_ushr(jAb, 32) & 0xFFFF
    jAb2 = ab(jAb)

    i2 = to_int32((l_ushr(j2, 32) ^ j5) ^ (l_ushr(jAb2, 16) & 0xFFFFFFFFFFFF0000))
    jAb3 = ab(jAb2)

    def get_char(idx):
        row = int(idx / 8191)
        col = int(idx % 8191)
        return ord(string_array[row][col])

    jCharAt = jAb3 ^ (get_char(i2) << 32)
    length = int(l_ushr(jCharAt, 32) & 0xFFFF)

    result = []
    for i in range(length):
        idx = i2 + i + 1
        jCharAt = to_int64(ab(jCharAt) ^ (get_char(idx) << 32))
        decrypted_char = int(l_ushr(jCharAt, 32) & 0xFFFF)
        result.append(chr(decrypted_char))
    return "".join(result)


# ============================================================
# Version 2: New algorithm (version C) — via REST API
# ============================================================


def decrypt_v2_api(long_val, api_url):
    """Call the WASLDH REST API to decrypt a single long value."""
    url = f"{api_url.rstrip('/')}/decrypt?key={long_val}"
    try:
        resp = urllib.request.urlopen(url, timeout=10)
        if resp.status == 200:
            return resp.read().decode("utf-8")
        else:
            raise RuntimeError(f"API returned status {resp.status}")
    except urllib.error.HTTPError as e:
        body = e.read().decode("utf-8") if e.code != 200 else ""
        raise RuntimeError(f"API error {e.code}: {body}")
    except urllib.error.URLError as e:
        raise RuntimeError(
            f"Cannot reach API at {api_url}: {e.reason}. Is WASLDH running?"
        )


def _parse_batch_response(data):
    """Parse batch API response lines into {long: string | None} dict.
    None means JNI error for that key."""
    lookup = {}
    for line in data.strip().split("\n"):
        if not line or ":" not in line:
            continue
        idx = line.index(":")
        try:
            lv = int(line[:idx])
            val = line[idx + 1 :].replace("\\n", "\n").replace("\\r", "\r")
            lookup[lv] = None if val.startswith("JNI Error: ") else val
        except ValueError:
            pass
    return lookup


def decrypt_batch_api(longs, api_url, timeout=120):
    """Decrypt multiple longs via the batch endpoint.
    Returns dict {long: string | None}.
    Falls back to individual requests on batch failure."""
    if not longs:
        return {}
    keys_str = ",".join(str(lv) for lv in longs)
    url = f"{api_url.rstrip('/')}/decryptBatch?keys={keys_str}"
    try:
        resp = urllib.request.urlopen(url, timeout=timeout)
        return (
            _parse_batch_response(resp.read().decode("utf-8"))
            if resp.status == 200
            else {}
        )
    except (urllib.error.HTTPError, urllib.error.URLError):
        # Fall back to individual requests for each long in the chunk
        result = {}
        for lv in longs:
            try:
                val = decrypt_v2_api(lv, api_url)
                result[lv] = val
                print(f'    [OK] 0x{lv:016x} -> "{val}"')
            except RuntimeError as e2:
                print(f"    [WARN] 0x{lv:016x} -> {e2}")
                result[lv] = None
        return result


def build_lookup_via_api(longs, api_url, batch_size=200):
    """Decrypt a list of longs via batch API in chunks, returning {long: string} dict."""
    lookup = {}
    total = len(longs)
    for chunk_start in range(0, total, batch_size):
        chunk = longs[chunk_start : chunk_start + batch_size]
        chunk_lookup = decrypt_batch_api(chunk, api_url)
        for i, lv in enumerate(chunk):
            result = chunk_lookup.get(lv)
            idx = chunk_start + i + 1
            if result is not None:
                lookup[lv] = result
                print(f'  [{idx}/{total}] 0x{lv:016x} -> "{result}"')
            else:
                print(f"  [{idx}/{total}] 0x{lv:016x} -> ERROR")
    return lookup


# File pattern for MagicFactory.get calls
_MF_PATTERN = re.compile(
    re.escape("MagicFactory.get")
    + r"\((-?(?:0x[0-9a-fA-F]+|\d+))[Ll]?"
    + r"(?:\s*,\s*(?:strArr\d*|[A-Za-z_$][\w$]*\.[A-Za-z_$][\w$]*))?\)"
)


def find_crypt_calls(java_content, call_name=None):
    """Find all MagicFactory.get calls in Java content."""
    matches = []
    for m in _MF_PATTERN.finditer(java_content):
        long_str = m.group(1)
        try:
            long_val = int(long_str, 0)
            matches.append((m, long_val))
        except ValueError:
            print(f"  Warning: Could not parse integer value: {long_str}")
    return matches


def collect_all_longs(root_dir):
    """Collect all unique long values from MagicFactory.get calls in all Java files."""
    longs = set()
    for fpath in sorted(Path(root_dir).rglob("*.java")):
        content = fpath.read_text(encoding="utf-8", errors="surrogateescape")
        for _, long_val in find_crypt_calls(content):
            longs.add(long_val)
    return sorted(longs)


def deobfuscate_file(java_path, lookup):
    """Replace MagicFactory.get calls in a file using a {long: string} lookup."""
    content = java_path.read_text(encoding="utf-8", errors="surrogateescape")
    matches = find_crypt_calls(content)
    if not matches:
        return 0, 0

    matches.sort(key=lambda x: x[0].start(), reverse=True)
    replaced = 0
    missed = 0

    for match, long_val in matches:
        if long_val not in lookup:
            missed += 1
            continue

        decrypted = lookup[long_val]
        try:
            decrypted.encode("utf-8")
        except UnicodeEncodeError:
            missed += 1
            continue

        decrypted_escaped = (
            decrypted.replace("\\", "\\\\")
            .replace('"', '\\"')
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t")
        )
        replacement = '"' + decrypted_escaped + '"'
        start, end = match.span()
        content = content[:start] + replacement + content[end:]
        replaced += 1

    if replaced > 0:
        java_path.write_text(content, encoding="utf-8", errors="surrogateescape")

    return replaced, missed


def parse_string_array(src_path: Path, array_name: str) -> list[str]:
    """Parse the string array from a Java file."""
    content = src_path.read_text(encoding="utf-8")
    pattern = (
        r"public\s+static\s+final\s+String\[\]\s+"
        + re.escape(array_name)
        + r"\s*=\s*\{(.*?)\}"
    )
    match = re.search(pattern, content, re.DOTALL)
    if not match:
        raise ValueError(f"Could not find string array '{array_name}' in {src_path}")

    strings = []
    for m in re.finditer(r'"((?:[^"\\]|\\.)*)"', match.group(1)):
        sv = (
            m.group(1)
            .encode("utf-8", errors="surrogateescape")
            .decode("unicode_escape")
        )
        strings.append(sv)

    if not strings:
        raise ValueError(f"Found empty string array '{array_name}' in {src_path}")
    return strings


def load_lookup_file(path):
    """Load a pre-built lookup file (long:string per line).
    Handles \n and \r escapes in the string part.
    """
    lookup = {}
    if not path or not path.exists():
        return lookup
    raw = path.read_text(encoding="utf-8")
    for line in raw.strip().split("\n"):
        if ":" not in line:
            continue
        idx = line.index(":")
        lv_str = line[:idx]
        val = line[idx + 1 :]
        try:
            lv = int(lv_str)
            # Unescape \n and \r
            val = val.replace("\\n", "\n").replace("\\r", "\r")
            lookup[lv] = val
        except ValueError:
            pass
    return lookup


def load_known_pairs(path):
    """Load known (long, string) pairs from logged output."""
    pairs = {}
    if not path or not path.exists():
        return pairs
    content = path.read_text(encoding="utf-8")
    lines = content.strip().split("\n")
    pending = []
    for line in lines:
        line = line.strip()
        if not line:
            continue
        m_call = re.match(r"get\(\) called with long arg: (-?\d+)", line)
        m_ret = re.match(r"get\(\) returned string: (.+)", line)
        if m_call:
            pending.append(int(m_call.group(1)))
        elif m_ret:
            ret_str = m_ret.group(1)
            if pending:
                call_val = pending.pop()
                pairs[call_val] = ret_str
    return pairs


# ============================================================
# CLI Implementation
# ============================================================


def main():
    parser = argparse.ArgumentParser(
        description="Deobfuscate WAuxiliary Java strings by reversing MagicFactory.get()."
    )
    subparsers = parser.add_subparsers(dest="command", help="Mode of operation")

    # bulk-normal — deobfuscate files in-place
    bp = subparsers.add_parser(
        "bulk", help="Deobfuscate all .java files in a directory"
    )
    bp.add_argument(
        "--lookup",
        type=Path,
        default=None,
        help="Pre-built lookup file (long:string per line), skips API",
    )
    bp.add_argument(
        "--api-url",
        default="http://localhost:8080",
        help="WASLDH decryption API base URL",
    )
    bp.add_argument(
        "--batch-size",
        type=int,
        default=200,
        help="Max keys per batch API request (default 200)",
    )
    bp.add_argument(
        "--known-pairs",
        type=Path,
        default=None,
        help="Fallback known pairs file for unavailable API (also: ./known_plaintext_new.txt)",
    )
    bp.add_argument(
        "--algo",
        choices=["v1", "v2", "auto"],
        default="auto",
        help="Version override (v1=old/B, v2=new/C, auto=guess)",
    )
    bp.add_argument(
        "directory", type=Path, help="Root directory of .java files to process"
    )
    bp.add_argument(
        "crypt_path",
        type=Path,
        help="Java file containing the String[] array (for v1 only)",
    )
    bp.add_argument("array_name", help="Name of the String[] field (for v1 only)")

    # single — decrypt one value
    sp = subparsers.add_parser("single", help="Decrypt a single long value via API")
    sp.add_argument(
        "--api-url",
        default="http://localhost:8080",
        help="WASLDH decryption API base URL",
    )
    sp.add_argument(
        "--algo",
        choices=["v1", "v2", "auto"],
        default="auto",
        help="Version override (v1=old/B, v2=new/C, auto=guess)",
    )
    sp.add_argument(
        "--known-pairs",
        type=Path,
        default=None,
        help="Fallback known pairs file for v2 (also: ./known_plaintext_new.txt)",
    )
    sp.add_argument("value", help="Long value to decrypt (decimal or 0x...)")
    sp.add_argument(
        "crypt_path",
        type=Path,
        nargs="?",
        help="Java file with the String[] array (required for v1)",
    )
    sp.add_argument(
        "array_name", nargs="?", help="String[] field name (required for v1)"
    )

    # preflight — build lookup from all longs in a directory
    pp = subparsers.add_parser(
        "preflight", help="Pre-decrypt all unique longs via API and save as known pairs"
    )
    pp.add_argument(
        "--api-url",
        default="http://localhost:8080",
        help="WASLDH decryption API base URL",
    )
    pp.add_argument(
        "--batch-size",
        type=int,
        default=200,
        help="Max keys per batch API request (default 200)",
    )
    pp.add_argument(
        "--output",
        "-o",
        type=Path,
        default=Path("known_pairs_generated.txt"),
        help="Output file path",
    )
    pp.add_argument(
        "directory", type=Path, help="Root directory of .java files to scan"
    )

    args = parser.parse_args()
    if not args.command:
        parser.print_help()
        return

    # ---- PREFLIGHT ----
    if args.command == "preflight":
        print(f"Scanning {args.directory} for MagicFactory.get calls...")
        longs = collect_all_longs(args.directory)
        print(
            f"Found {len(longs)} unique long values. Decrypting via {args.api_url}..."
        )
        lookup = build_lookup_via_api(longs, args.api_url, args.batch_size)
        with open(args.output, "w", encoding="utf-8") as f:
            for lv in sorted(lookup):
                val = lookup[lv].replace("\\n", "\\\\n").replace("\\r", "\\\\r")
                f.write(f"{lv}:{val}\n")
        print(f"\nSaved {len(lookup)} pairs to {args.output}")
        # Also print summary
        total = len(longs)
        ok = len(lookup)
        print(f"Decrypted: {ok}/{total}")
        return

    # ---- SINGLE ----
    if args.command == "single":
        val_str = args.value
        if val_str.startswith("0x") or val_str.startswith("0X"):
            val = int(val_str, 16)
        else:
            val = int(val_str.rstrip("Ll"), 0)

        if args.algo == "v1":
            if not args.crypt_path or not args.array_name:
                print("Error: v1 mode requires crypt_path and array_name")
                sys.exit(1)
            string_array = parse_string_array(args.crypt_path, args.array_name)
            result = decrypt_v1(val, string_array)
        else:
            # v2 via API
            try:
                result = decrypt_v2_api(val, args.api_url)
            except RuntimeError as e:
                # Fall back to known pairs file
                kp = args.known_pairs
                if kp is None:
                    for c in [
                        Path("known_plaintext_new.txt"),
                        Path("known_plaintext_old.txt"),
                    ]:
                        if c.exists():
                            kp = c
                            break
                if kp and kp.exists():
                    pairs = load_known_pairs(kp)
                    if val in pairs:
                        result = pairs[val]
                        print(f"(Used known-pairs fallback for {val})")
                    else:
                        print(f"{e}")
                        sys.exit(1)
                else:
                    print(f"{e}")
                    sys.exit(1)

        print(f'\nDecrypted: "{result}"')
        if pyperclip:
            try:
                pyperclip.copy(result)
                print("Copied to clipboard.")
            except Exception:
                pass
        return

    # ---- BULK ----
    if args.command == "bulk":
        algo = args.algo
        if algo == "auto":
            # Check if crypt_path has 8191-char rows (v2 indicator)
            try:
                sa = parse_string_array(args.crypt_path, args.array_name)
                is_v2 = (
                    bool(sa)
                    and all(len(s) == 8191 for s in sa[:-1])
                    and len(sa[-1]) <= 8191
                )
                algo = "v2" if is_v2 else "v1"
                print(
                    f"Auto-detected: version {'C (API)' if is_v2 else 'B (pure Python)'}"
                )
            except Exception:
                algo = "v2"
                print("Could not detect version, assuming v2 (API mode)")

        if algo == "v1":
            # Use pure-Python decrypt_v1
            string_array = parse_string_array(args.crypt_path, args.array_name)
            java_files = sorted(args.directory.rglob("*.java"))
            print(f"Scanning {len(java_files)} files (v1)...")
            total_reps = 0
            for f in java_files:
                content = f.read_text(encoding="utf-8", errors="surrogateescape")
                matches = find_crypt_calls(content)
                if not matches:
                    continue
                rep, _ = deobfuscate_file(f, {})  # won't match anything
                # Actually do v1 decryption
                matches.sort(key=lambda x: x[0].start(), reverse=True)
                replaced = 0
                for match, long_val in matches:
                    try:
                        decrypted = decrypt_v1(long_val, string_array)
                        decrypted.encode("utf-8")
                        escaped = (
                            decrypted.replace("\\", "\\\\")
                            .replace('"', '\\"')
                            .replace("\n", "\\n")
                            .replace("\r", "\\r")
                            .replace("\t", "\\t")
                        )
                        replacement = '"' + escaped + '"'
                        start, end = match.span()
                        content = content[:start] + replacement + content[end:]
                        replaced += 1
                        print(f'  {match.group(0)} -> "{decrypted}"')
                    except Exception as e:
                        print(f"  ERROR decrypting {match.group(0)}: {e}")
                if replaced > 0:
                    f.write_text(content, encoding="utf-8", errors="surrogateescape")
                total_reps += replaced
            print(f"\nFinished. Total replacements: {total_reps}")

        else:
            # v2: build lookup from API or load from file
            if args.lookup and args.lookup.exists():
                lookup = load_lookup_file(args.lookup)
                print(f"Loaded {len(lookup)} entries from {args.lookup}")
            else:
                longs = collect_all_longs(args.directory)
                print(f"Found {len(longs)} unique MagicFactory.get calls.")
                print(f"Decrypting via {args.api_url}...")
                lookup = build_lookup_via_api(longs, args.api_url, args.batch_size)
                print(f"\nDecrypted {len(lookup)}/{len(longs)} values.")

            # If we have fallback known pairs, augment lookup
            kp_path = args.known_pairs
            if kp_path is None:
                for c in [
                    Path("known_plaintext_new.txt"),
                    Path("known_plaintext_old.txt"),
                ]:
                    if c.exists():
                        kp_path = c
                        break
            if kp_path and kp_path.exists():
                fallback = load_known_pairs(kp_path)
                for lv, s in fallback.items():
                    if lv not in lookup:
                        lookup[lv] = s
                print(f"Augmented with {len(fallback)} fallback pairs from {kp_path}")

            # Apply replacements
            java_files = sorted(args.directory.rglob("*.java"))
            total_reps = 0
            total_missed = 0
            for f in java_files:
                rep, miss = deobfuscate_file(f, lookup)
                if rep:
                    print(
                        f"  {f.name}: {rep} replaced"
                        + (f", {miss} missed" if miss else "")
                    )
                total_reps += rep
                total_missed += miss
            print(f"\nFinished. Total replacements: {total_reps}")
            if total_missed:
                print(f"Missed (no decryption): {total_missed}")
            return


if __name__ == "__main__":
    main()
