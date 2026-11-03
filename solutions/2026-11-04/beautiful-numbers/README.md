# Beautiful numbers

Codeforces 55D, difficulty 2500. [Archived problem](https://codeforces.com/problemset/problem/55/D)

**Accepted** on November 4, 2026 (Asia/Kolkata). [Judge record](https://codeforces.com/contest/55/submission/397272734)

## Approach

Track the prefix remainder modulo 2520 and the least common multiple of its nonzero digits. Every possible digit LCM divides 2520, leaving only 48 LCM states. Memoize unrestricted suffixes by remaining length, remainder and LCM. At the end require the remainder to be divisible by the LCM. Leading zeroes do not change the LCM; zero cancels when subtracting prefix counts. Count the inclusive range by count(r) minus count(l-1). O(D * 2520 * 48 * 10 + t * D * 10) time and O(D * 2520 * 48) space, with D <= 19.

## Verification

100 ranges checked against brute-force enumeration, both official samples, singleton cases, and maximum bound 9e18. Run `python3 test_solution.py` for the checked-in examples and edge cases.
