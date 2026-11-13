# 1338-a

[Original practice problem](https://codeforces.com/problemset/problem/1338/A)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To make the array non-decreasing, for each element a[i], we need to ensure a[i] >= max(a[0...i-1]). If a[i] < max_prev, we need to add at least (max_prev - a[i]) to a[i]. Let D be the maximum difference required across all elements. Since we can add 2^0 + 2^1 + ... + 2^(T-1) = 2^T - 1, we need 2^T - 1 >= D, or 2^T > D. Thus, T is the smallest integer such that 2^T > D, which is the number of bits required to represent D. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
