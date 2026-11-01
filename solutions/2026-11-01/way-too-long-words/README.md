# Way Too Long Words

Problem: [Way Too Long Words](https://codeforces.com/problemset/problem/71/A)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Accepted**

## Approach

Keep words of length at most ten unchanged. Otherwise retain the first and last characters with the interior character count between them. This constructs exactly the required abbreviation.

## Complexity

O(L) time to read all L characters; O(L) space for parsed input and output.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 101 checks passed. Tests are original and do not represent the hidden judge suite.

## Judge result

Status: **Accepted**. Submission/log ID: `396991783`.

[Judge record](https://codeforces.com/problemset/submission/71/396991783). Verified in the logged-in platform UI on November 1, 2026. `submission.py` preserves the submitted code; `solution.py` is the independently tested reusable version.

AI-assisted archived practice; no rated contest participation is claimed.
