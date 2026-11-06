# 451-b

[Original practice problem](https://codeforces.com/problemset/problem/451/B)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The approach identifies the first and last indices where the array deviates from a sorted state. By reversing the segment between these indices, we check if the resulting array is sorted. Time complexity is O(N log N) due to sorting for comparison, and space complexity is O(N) to store the array.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
