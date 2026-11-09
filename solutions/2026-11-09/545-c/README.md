# 545-c

[Original practice problem](https://codeforces.com/problemset/problem/545/C)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using a greedy approach. We iterate through the trees from left to right. For each tree, we first try to fell it to the left if there is space between the current tree and the previous occupied point. If not, we try to fell it to the right if there is space before the next tree. If neither is possible, we leave the tree standing. The last tree can always be felled to the right if there is space. Time complexity is O(n) and space complexity is O(n) to store the tree data.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
