# 1-a

[Original practice problem](https://codeforces.com/problemset/problem/1/A)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To cover a rectangle of size n x m with squares of size a x a, we need ceil(n/a) stones along one dimension and ceil(m/a) stones along the other. Using integer arithmetic, ceil(x/y) is calculated as (x + y - 1) / y. Since n, m, a can be up to 10^9, we use long to prevent overflow. Time complexity is O(1), space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
