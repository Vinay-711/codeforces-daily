# 486-a

[Original practice problem](https://codeforces.com/problemset/problem/486/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The function f(n) = -1 + 2 - 3 + 4 ... + (-1)^n * n. If n is even, the sum is n/2. If n is odd, the sum is -(n+1)/2. This is derived by grouping terms: (-1+2) + (-3+4) + ... = 1 + 1 + ... = n/2 for even n, and for odd n, it is (n-1)/2 - n = -(n+1)/2. Time complexity is O(1), space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
