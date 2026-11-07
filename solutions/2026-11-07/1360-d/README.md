# 1360-d

[Original practice problem](https://codeforces.com/problemset/problem/1360/D)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To find the minimum number of packages, we need to find the largest divisor 'd' of 'n' such that 'd <= k'. If such a 'd' exists, the number of packages is 'n / d'. We iterate from 1 up to sqrt(n) to find all divisors. For each divisor 'd', we check if 'd <= k' (update result with n/d) and if 'n/d <= k' (update result with d). Time complexity is O(sqrt(n)) per test case.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
