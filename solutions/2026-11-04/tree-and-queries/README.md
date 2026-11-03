# Tree and Queries

Codeforces 375D, difficulty 2400. [Archived problem](https://codeforces.com/problemset/problem/375/D)

**Accepted** on November 4, 2026 (Asia/Kolkata). [Judge record](https://codeforces.com/contest/375/submission/397270207)

## Approach

Preorder subtree ranges and Mo’s algorithm with frequency thresholds. O(n + q log q + n sqrt(q)) time and O(n + q + C) space, where C bounds the color IDs.

## Verification

4,900 queries against direct subtree counts. Run `python3 test_solution.py` for the checked-in examples and edge cases.
