# 295-a

[Original practice problem](https://codeforces.com/problemset/problem/295/A)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using two layers of difference arrays. First, we use a difference array to count how many times each operation is performed based on the k queries. Then, we use a second difference array to apply the cumulative effect of these operations to the original array. Time complexity is O(n + m + k) and space complexity is O(n + m).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
