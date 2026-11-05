# 1352-c

[Original practice problem](https://codeforces.com/problemset/problem/1352/C)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for the k-th number not divisible by n. Every block of n-1 numbers contains exactly one number divisible by n. We can calculate the result by observing that for every (n-1) numbers, we skip one. The formula is k + (k - 1) / (n - 1). This runs in O(1) per test case, O(T) total time, and O(1) space.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
