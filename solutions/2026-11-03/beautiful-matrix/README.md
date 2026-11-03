# Beautiful Matrix

Problem: [beautiful-matrix](https://codeforces.com/problemset/problem/263/A)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [397225199](https://codeforces.com/problemset/submission/263/397225199), Java 21.

## Approach

Locate the only one. Each adjacent row or column swap reduces its distance to the middle by at most one; moving vertically then horizontally attains the sum of distances.

Complexity: O(25) = O(1) time and O(1) extra space.

## Verification

Run `python3 solutions/2026-11-03/beautiful-matrix/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.

Recovery: sign-in was restored and the user completed the required anti-bot verification. The final judge result is confirmed in the normal status page and official user.status API.
