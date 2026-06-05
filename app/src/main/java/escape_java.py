#!/usr/bin/env -S uv run --script

import json
import re
import sys
from pathlib import Path

# --- CONFIGURATION THRESHOLDS ---
LENGTH_THRESHOLD = 100000  # Minimum character length to consider "incredibly long"
# --------------------------------


def escape_uncommon_chars(line: str) -> str:
    r"""
    Escapes non-ASCII characters into standard Java \uxxxx format.
    Handles characters outside the BMP (like emojis) by converting them
    to surrogate pairs automatically.
    """
    escaped_line = []
    for char in line:
        if ord(char) > 127:
            # json.dumps returns a string like '"\\u2605"' or '"\\ud83d\\ude00"'
            # Stripping the outer quotes leaves the exact Java-compliant escape sequence
            escaped_char = json.dumps(char)[1:-1]
            escaped_line.append(escaped_char)
        else:
            escaped_line.append(char)
    return "".join(escaped_line)


def scan_and_escape(target_dir: str):
    base_path = Path(target_dir).resolve()

    if not base_path.is_dir():
        print(f"Error: '{target_dir}' is not a valid directory.", file=sys.stderr)
        sys.exit(1)

    # Phase 1: scan all .java files for the one incredibly long line
    matches = []  # list of (file_path, line_index, line)

    for file_path in base_path.rglob("*.java"):
        try:
            with open(file_path, "r", encoding="utf-8") as f:
                lines = f.readlines()
        except (UnicodeDecodeError, IOError):
            continue

        for idx, line in enumerate(lines):
            if len(line) > LENGTH_THRESHOLD:
                matches.append((file_path, idx, line))

    if not matches:
        print(
            f"Error: no incredibly long line found (threshold={LENGTH_THRESHOLD})",
            file=sys.stderr,
        )
        sys.exit(1)

    if len(matches) > 1:
        print(
            f"Error: found {len(matches)} incredibly long lines, expected exactly 1:",
            file=sys.stderr,
        )
        for m_path, m_idx, m_line in matches:
            try:
                rel = m_path.relative_to(Path.cwd())
            except ValueError:
                rel = m_path
            m = re.search(r"String\[\]\s+(\w+)\s*=", m_line)
            vn = m.group(1) if m else "?"
            print(f"  {rel};{vn}", file=sys.stderr)
        sys.exit(1)

    file_path, idx, line = matches[0]

    # Phase 2: print identifier
    try:
        relative_path = file_path.relative_to(Path.cwd())
    except ValueError:
        relative_path = file_path
    match = re.search(r"String\[\]\s+(\w+)\s*=", line)
    var_name = match.group(1) if match else "?"
    print(f"{relative_path};{var_name}")

    # Phase 3: escape the line in place
    with open(file_path, "r", encoding="utf-8") as f:
        lines = f.readlines()
    lines[idx] = escape_uncommon_chars(line)
    with open(file_path, "w", encoding="utf-8") as f:
        f.writelines(lines)


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python escape_java.py <directory_path>", file=sys.stderr)
        sys.exit(1)

    scan_and_escape(sys.argv[1])
