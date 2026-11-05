# 189-a

[Original practice problem](https://codeforces.com/problemset/problem/189/A)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We can solve this problem using Dynamic Programming. Let dp[i] represent the maximum number of pieces we can get for a ribbon of length i. We initialize dp[0] = 0 and all other dp[i] = -1 (representing unreachable states). For each length i from 1 to n, we try adding a piece of length a, b, or c to a previously reachable state (i - a, i - b, or i - c). The transition is dp[i] = max(dp[i - a] + 1, dp[i - b] + 1, dp[i - c] + 1). The answer will be stored in dp[n]. This approach takes O(n) time and O(n) space.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
