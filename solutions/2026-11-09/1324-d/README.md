# 1324-d

[Original practice problem](https://codeforces.com/problemset/problem/1324/D)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The condition a_i + a_j > b_i + b_j can be rewritten as (a_i - b_i) + (a_j - b_j) > 0. Let c_i = a_i - b_i. We need to find pairs (i, j) with i < j such that c_i + c_j > 0. By sorting the array c, we can use a two-pointer approach to count pairs in O(n log n) time and O(n) space.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
