# Helpful Maths

Problem: [helpful-maths](https://codeforces.com/problemset/problem/339/A)

Status: **Blocked** — locally tested, unsubmitted. Codeforces is logged out; the normal login path encounters Cloudflare verification and an unavailable page. Human sign-in is required. The public submission history confirms this problem has no accepted submission for vinay711.

## Approach

Only digits 1, 2 and 3 appear as operands. Count them at even character positions and emit each count in increasing digit order, inserting separators only between operands.

Complexity: O(n) time and O(n) output storage.

## Verification

Run `python3 solutions/2026-11-03/helpful-maths/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
