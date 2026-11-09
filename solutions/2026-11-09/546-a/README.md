# 546-a

[Original practice problem](https://codeforces.com/problemset/problem/546/A)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The total cost is the sum of an arithmetic progression: k + 2k + ... + wk = k * (w * (w + 1) / 2). We calculate this total cost, subtract the initial money n, and if the result is positive, that is the amount to borrow; otherwise, the answer is 0. Time complexity is O(1) and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
