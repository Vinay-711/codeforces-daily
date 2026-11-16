# 1285-c

[Original practice problem](https://codeforces.com/problemset/problem/1285/C)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize max(a, b) where LCM(a, b) = X, we need a and b to be as close to sqrt(X) as possible, while satisfying gcd(a, b) = 1. We find all divisors of X up to sqrt(X). For each divisor 'i', if gcd(i, X/i) == 1, then (i, X/i) is a valid pair. We track the pair that minimizes max(i, X/i). Time complexity is O(sqrt(X)) to find divisors, space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
