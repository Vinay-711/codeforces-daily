# 893-c

[Original practice problem](https://codeforces.com/problemset/problem/893/C)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for the minimum cost to spread a rumor to all characters. Since characters share rumors with friends, this is equivalent to finding the minimum cost character in each connected component of the friendship graph. We use an adjacency list to represent the graph and perform a Depth First Search (DFS) to traverse each connected component, keeping track of the minimum cost found within that component. The total cost is the sum of these minimums. Time complexity is O(N + M) and space complexity is O(N + M).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
