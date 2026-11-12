# 189-a

[Original practice problem](https://codeforces.com/problemset/problem/189/A)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.
Submission ID: `398358510`

## Approach

We can solve this problem using dynamic programming. We define dp[i] as the maximum number of pieces for ribbon length i. We initialize dp array with -1 and dp[0] = 0. For each length from 1 to n, we check if we can form it using lengths a, b, or c. The time complexity is O(N) and space complexity is O(N), where N <= 4000.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
