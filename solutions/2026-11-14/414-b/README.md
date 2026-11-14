# 414-b

[Original practice problem](https://codeforces.com/problemset/problem/414/B)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We use dynamic programming where dp[i][j] represents the number of good sequences of length i ending with the number j. The transition is dp[i][j] = sum(dp[i-1][m]) for all m such that m divides j. To optimize, we iterate through multiples: for each length i and each number m, we add dp[i-1][m] to all multiples of m (j = m, 2m, 3m...). Time complexity is O(k * n * log n) due to the harmonic series sum, and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
