# Petya And Strings

Problem: [petya-and-strings](https://codeforces.com/problemset/problem/112/A)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [397225077](https://codeforces.com/problemset/submission/112/397225077), Java 21.

## Approach

Compare the equal-length Latin strings ignoring case, then normalize the comparison result to -1, 0 or 1. The first differing character determines lexicographic order.

Complexity: O(n) time and O(n) input storage.

## Verification

Run `python3 solutions/2026-11-03/petya-and-strings/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.

Recovery: sign-in was restored and the user completed the required anti-bot verification. The final judge result is confirmed in the normal status page and official user.status API.
