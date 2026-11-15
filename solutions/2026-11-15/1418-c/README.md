# 1418-c

[Original practice problem](https://codeforces.com/problemset/problem/1418/C)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We use dynamic programming to solve this problem. Let dp[i][0] be the minimum skip points needed to clear bosses up to index i, ending with the friend's turn, and dp[i][1] be the minimum skip points ending with my turn. The friend can kill 1 or 2 bosses (costing a[i] and a[i]+a[i+1] respectively), and I can kill 1 or 2 bosses (costing 0). The state transitions are based on who takes the next turn. Time complexity is O(n) per test case, space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
