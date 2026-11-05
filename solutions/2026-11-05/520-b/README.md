# 520-b

[Original practice problem](https://codeforces.com/problemset/problem/520/B)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved by working backwards from m to n. If m > n, if m is even, we divide by 2; if m is odd, we add 1. If m <= n, we simply add the difference (n - m). This greedy approach is optimal because working backwards uniquely determines the path. Time complexity is O(log m) and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
