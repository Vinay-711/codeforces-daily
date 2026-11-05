# 279-b

[Original practice problem](https://codeforces.com/problemset/problem/279/B)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using a sliding window (two-pointer) approach. We maintain a window [left, right] representing the contiguous range of books Valera reads. We expand the right pointer to include books as long as the total time is within the limit t. If the time exceeds t, we increment the left pointer to shrink the window until the condition is met again. The maximum window size encountered is the answer. Time complexity is O(n) and space complexity is O(n) to store the input array.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
