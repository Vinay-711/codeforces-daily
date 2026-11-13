# 474-d

[Original practice problem](https://codeforces.com/problemset/problem/474/D)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We can solve this problem using dynamic programming with prefix sums. Let dp[i] be the number of valid flower sequences of length i. At length i, we can either place 1 Red flower (adding dp[i - 1] ways) or k White flowers (adding dp[i - k] ways if i >= k). Thus, the recurrence relation is dp[i] = dp[i - 1] + (i >= k ? dp[i - k] : 0) modulo 10^9 + 7. After precomputing dp[i] for all lengths up to 100,000, we compute prefix sums pref[i] = (pref[i - 1] + dp[i]) % MOD. Each query (a, b) can then be answered in O(1) time as (pref[b] - pref[a - 1] + MOD) % MOD.

Time Complexity: O(MAX + t) where MAX = 100,000, which easily passes within the time limit.
Space Complexity: O(MAX) for the DP and prefix sum arrays.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
