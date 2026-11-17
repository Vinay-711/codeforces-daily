# 1167-c

[Original practice problem](https://codeforces.com/problemset/problem/1167/C)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using the Disjoint Set Union (DSU) data structure. Each user is initially their own parent with a set size of 1. For each group, we union all members together. The size of the component is maintained in the root of each set. After processing all groups, the answer for each user is the size of the component they belong to. Time complexity is O((N+M) * alpha(N)) where alpha is the inverse Ackermann function, and space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
