# 450-b

[Original practice problem](https://codeforces.com/problemset/problem/450/B)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The sequence follows the pattern f1=x, f2=y, f3=y-x, f4=-x, f5=-y, f6=x-y, and then repeats every 6 terms. We calculate (n-1) % 6 to find the index in the cycle and handle negative results by adding the modulus 10^9 + 7.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
