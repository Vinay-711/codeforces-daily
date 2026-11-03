# Cats Transport

Codeforces 311B, difficulty 2400. [Archived problem](https://codeforces.com/problemset/problem/311/B)

**Accepted** on November 4, 2026 (Asia/Kolkata). [Judge record](https://codeforces.com/contest/311/submission/397271951)

## Approach

Sorted adjusted arrival times and monotone convex hull DP. O(n + m log m + pm) time and O(n+m) space.

## Verification

200 instances against quadratic DP; 12 Java/reference comparisons passed. Run `python3 test_solution.py` for the checked-in examples and edge cases.
