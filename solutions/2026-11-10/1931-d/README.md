# 1931-d

[Original practice problem](https://codeforces.com/problemset/problem/1931/D)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To solve this problem, we need to count pairs (i, j) with i < j such that (a_i + a_j) % x == 0 and (a_i - a_j) % y == 0.
Using modular arithmetic:
1. (a_i + a_j) % x == 0 implies a_i % x == (x - (a_j % x)) % x.
2. (a_i - a_j) % y == 0 implies a_i % y == a_j % y.

Thus, for each element a_j, we search for previous elements a_i that have a specific remainder pair ((x - (a_j % x)) % x, a_j % y). We can pack the remainder pair into a single 64-bit integer (`long`) key by shifting `rem_x` by 32 bits and OR-ing with `rem_y`. We maintain frequencies of seen remainder pairs using a HashMap.

Time Complexity: O(n) on average per test case.
Space Complexity: O(n) to store frequencies in the HashMap.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
