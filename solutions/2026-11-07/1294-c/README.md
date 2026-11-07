# 1294-c

[Original practice problem](https://codeforces.com/problemset/problem/1294/C)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To find three distinct integers a, b, c such that a*b*c = n and a, b, c >= 2, we greedily find the smallest possible divisor 'a' (>=2), then the smallest possible divisor 'b' (>=2) of n/a such that b != a, and finally check if c = n/(a*b) is >= 2 and c != a and c != b. Time complexity is O(sqrt(n)) per test case, space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
