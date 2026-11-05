# 455-a

[Original practice problem](https://codeforces.com/problemset/problem/455/A)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is a variation of the House Robber problem. Let count[i] be the total points obtained by picking all occurrences of number i. If we pick i, we cannot pick i-1 or i+1. Let dp[i] be the max points using numbers up to i. The recurrence is dp[i] = max(dp[i-1], dp[i-2] + count[i]). We use an array of size 100001 to store frequencies and compute the DP. Time complexity is O(N + M) where N is the number of elements and M is the max value (10^5). Space complexity is O(M).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
