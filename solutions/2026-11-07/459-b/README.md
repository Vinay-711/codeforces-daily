# 459-b

[Original practice problem](https://codeforces.com/problemset/problem/459/B)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The maximum difference is the difference between the maximum and minimum values in the array. If all elements are the same, the difference is 0 and the number of ways is n*(n-1)/2. Otherwise, the number of ways is the count of minimum elements multiplied by the count of maximum elements. Time complexity is O(n) and space complexity is O(n) to store the input.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
