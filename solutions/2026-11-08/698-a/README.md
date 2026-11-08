# 698-a

[Original practice problem](https://codeforces.com/problemset/problem/698/A)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We use dynamic programming to solve this problem. Let dp[i][last_activity] be the minimum rest days up to day i, where last_activity is 0 (rest), 1 (contest), or 2 (gym). For each day, we transition based on the available activities (gym/contest) and ensure we don't repeat the same activity as the previous day. Time complexity is O(n), space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
