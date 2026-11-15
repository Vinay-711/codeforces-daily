# 1366-b

[Original practice problem](https://codeforces.com/problemset/problem/1366/B)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for the range of indices that can possibly hold the value 1. Since we start with 1 at position x, we maintain a range [L, R] that represents all indices that could currently hold the 1. For each operation [l_i, r_i], if the current range [L, R] overlaps with [l_i, r_i], the 1 can potentially move to any position within the union of [L, R] and [l_i, r_i]. Thus, we update L = min(L, l_i) and R = max(R, r_i) if there is an intersection. The time complexity is O(m) per test case, and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
