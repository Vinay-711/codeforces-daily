"""Run all original Python solution harnesses without external dependencies."""
from pathlib import Path
import subprocess
import sys


def main():
    root = Path(__file__).resolve().parents[1]
    tests = sorted((root / "solutions").glob("**/test_*.py"))
    if not tests:
        print("No solution harnesses found; refusing to report a passing check.")
        return 1
    failures = []
    for test in tests:
        print(f"Checking {test.relative_to(root)}", flush=True)
        try:
            result = subprocess.run([sys.executable, str(test)], cwd=root, timeout=60)
            if result.returncode:
                failures.append(str(test.relative_to(root)))
        except subprocess.TimeoutExpired:
            failures.append(str(test.relative_to(root)) + " (timeout)")
    print(f"{len(tests) - len(failures)}/{len(tests)} solution harnesses passed")
    for failure in failures:
        print(f"FAILED: {failure}")
    return int(bool(failures))


if __name__ == "__main__":
    raise SystemExit(main())
