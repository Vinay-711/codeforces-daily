# 431-c

[Original practice problem](https://codeforces.com/problemset/problem/431/C)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We use dynamic programming with two states: dp[i][0] is the number of paths with sum i that do not contain any edge with weight >= d, and dp[i][1] is the number of paths with sum i that contain at least one edge with weight >= d. The transitions involve iterating through all possible edge weights from 1 to k. Time complexity is O(n*k), space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
