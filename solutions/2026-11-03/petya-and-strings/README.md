# Petya And Strings

Problem: [petya-and-strings](https://codeforces.com/problemset/problem/112/A)

Status: **Blocked** — locally tested, unsubmitted. Codeforces is logged out; the normal login path encounters Cloudflare verification and an unavailable page. Human sign-in is required. The public submission history confirms this problem has no accepted submission for vinay711.

## Approach

Compare the equal-length Latin strings ignoring case, then normalize the comparison result to -1, 0 or 1. The first differing character determines lexicographic order.

Complexity: O(n) time and O(n) input storage.

## Verification

Run `python3 solutions/2026-11-03/petya-and-strings/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
