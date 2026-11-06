# 489-c

[Original practice problem](https://codeforces.com/problemset/problem/489/C)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using a greedy approach. For the maximum number, we greedily place the largest possible digit (9) from left to right. For the minimum number, we ensure the first digit is at least 1 (unless m=1 and s=0) and then greedily place the smallest possible digits from right to left to keep the leading digits small. Time complexity is O(m), space complexity is O(m).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
