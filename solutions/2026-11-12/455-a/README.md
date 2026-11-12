# 455-a

[Original practice problem](https://codeforces.com/problemset/problem/455/A)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.
Submission ID: `398358725`

## Approach

The problem is a variation of the House Robber problem. Let count[i] be the frequency of number i in the input. If we choose to pick number i, we gain i * count[i] points, but we cannot pick i-1 or i+1. Let dp[i] be the maximum points we can get using numbers up to i. The recurrence is dp[i] = max(dp[i-1], dp[i-2] + i * count[i]). The time complexity is O(N + M) where N is the number of elements and M is the maximum value (10^5), and space complexity is O(M).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
