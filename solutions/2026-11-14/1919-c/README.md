# 1919-c

[Original practice problem](https://codeforces.com/problemset/problem/1919/C)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We maintain two subsequences s and t, tracking their last elements. For each new element x, we try to place it in a subsequence where it doesn't increase the penalty (i.e., x <= last_element). If both subsequences would increase the penalty, we greedily choose the one with the smaller last element to minimize future penalty increases. If one or both can accommodate x without penalty, we pick the one that keeps the last element as large as possible to maximize future flexibility. Time complexity is O(n) per test case, space complexity is O(n) to store the input.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
