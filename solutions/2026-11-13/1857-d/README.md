# 1857-d

[Original practice problem](https://codeforces.com/problemset/problem/1857/D)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The condition a_u - a_v >= b_u - b_v can be rearranged to a_u - b_u >= a_v - b_v. Let c_i = a_i - b_i. A vertex u is strong if for all v, c_u >= c_v. This means the strong vertices are exactly those indices i where c_i is the maximum value in the array c. The time complexity is O(N) per test case, and space complexity is O(N) to store the arrays.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
