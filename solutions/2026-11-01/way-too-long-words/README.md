# Way Too Long Words

Problem: [Way Too Long Words](https://codeforces.com/problemset/problem/71/A)

Date: 2026-11-01 (Asia/Kolkata)

Status: **Prepared — locally tested; not submitted to the platform.**

## Approach

Keep words of length at most ten unchanged. Otherwise retain the first and last characters with the interior character count between them. This constructs exactly the required abbreviation.

## Complexity

O(L) time to read all L characters; O(L) space for parsed input and output.

## Local verification

Run `python3 -B test_solution.py` from this folder.

Result: 101 checks passed. Tests are original and do not represent the hidden judge suite.

## Submission blocker

Browser automation connection failed (Debugger unattached) before account history and judge submission could be verified. Prior accepted status is unknown; this is not claimed as a new platform solve. Automated-submission permission must be verified before a later submission.

AI-assisted practice solution; no contest participation or rating change is claimed.
