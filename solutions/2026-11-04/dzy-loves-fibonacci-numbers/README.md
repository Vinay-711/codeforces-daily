# DZY Loves Fibonacci Numbers

Codeforces 446C, difficulty 2400. [Archived problem](https://codeforces.com/problemset/problem/446/C)

**Accepted** on November 4, 2026 (Asia/Kolkata). [Judge record](https://codeforces.com/contest/446/submission/397272088)

## Approach

Lazy segment tree with two Fibonacci recurrence seeds per node. O(n + q log n) time and O(n) space.

## Verification

4,800 randomized operations compared with direct simulation. Run `python3 test_solution.py` for the checked-in examples and edge cases.
