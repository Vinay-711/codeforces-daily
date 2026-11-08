# 1372-b

[Original practice problem](https://codeforces.com/problemset/problem/1372/B)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize LCM(a, b) where a + b = n, we want to maximize the greatest common divisor (GCD) of a and b. Let g = GCD(a, b). Then a = gx and b = gy, where x + y = n/g. Since g must be a divisor of n, we find the largest proper divisor 'd' of n. By setting a = d and b = n - d, we ensure that d is the largest possible factor, which minimizes the LCM. The time complexity is O(sqrt(n)) per test case to find the largest divisor.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
