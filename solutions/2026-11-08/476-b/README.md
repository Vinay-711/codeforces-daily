# 476-b

[Original practice problem](https://codeforces.com/problemset/problem/476/B)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Calculate the target position from the first string. Count the number of '+' and '-' in the second string. For each '?', there are two possibilities (+1 or -1). Use recursion or bit manipulation to explore all 2^k possibilities (where k is the number of '?') and count how many result in the target position. Divide by 2^k. Time complexity is O(2^N) where N <= 10, which is very efficient.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
