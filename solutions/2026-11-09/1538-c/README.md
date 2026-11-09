# 1538-c

[Original practice problem](https://codeforces.com/problemset/problem/1538/C)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Sort the array and use two pointers to count pairs. For each element a[i], the number of elements a[j] (where j > i) such that l <= a[i] + a[j] <= r is equivalent to finding the count of elements in range [l - a[i], r - a[i]]. This can be calculated as count(<= r - a[i]) - count(<= l - a[i] - 1). Using binary search or two pointers, we can find these counts in O(n log n) time complexity. Space complexity is O(n) to store the array.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
