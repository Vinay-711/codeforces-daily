# Boy Or Girl

Problem: [boy-or-girl](https://codeforces.com/problemset/problem/236/A)

Status: **Accepted** — judge verified on 2026-11-03 (Asia/Kolkata).

Submission: [official judge record](https://codeforces.com/contest/236/submission/397263255).

Part of the separately requested extra practice set on 2026-11-03, beyond the daily three. AI-assisted archived practice.

## Approach

Track which lowercase letters occur. Apply only the parity rule specified in this fictional problem; duplicate occurrences do not change the count.

Complexity: O(n) time, O(26) = O(1) space.

## Verification

Run `python3 solutions/2026-11-03/boy-or-girl/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
