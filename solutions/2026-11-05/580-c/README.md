# 580-c

[Original practice problem](https://codeforces.com/problemset/problem/580/C)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using a Depth First Search (DFS) traversal on the tree. We maintain the current count of consecutive cats on the path from the root to the current node. If a node has a cat, we increment the current consecutive count; otherwise, we reset it to 0. If at any point the consecutive count exceeds m, we prune that branch. If we reach a leaf node (a node with no children other than its parent) and the consecutive count is within the limit, we count it as a valid restaurant. Time complexity is O(n) as we visit each node once, and space complexity is O(n) for the adjacency list and recursion stack.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
