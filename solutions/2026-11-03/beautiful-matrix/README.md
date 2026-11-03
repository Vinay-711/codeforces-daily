# Beautiful Matrix

Problem: [beautiful-matrix](https://codeforces.com/problemset/problem/263/A)

Status: **Blocked** — locally tested, unsubmitted. Codeforces is logged out; the normal login path encounters Cloudflare verification and an unavailable page. Human sign-in is required. The public submission history confirms this problem has no accepted submission for vinay711.

## Approach

Locate the only one. Each adjacent row or column swap reduces its distance to the middle by at most one; moving vertically then horizontally attains the sum of distances.

Complexity: O(25) = O(1) time and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/beautiful-matrix/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
