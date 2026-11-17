# 377-a

[Original practice problem](https://codeforces.com/problemset/problem/377/A)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks to turn exactly k empty cells into walls while keeping the remaining empty cells connected. We can achieve this by performing a Depth First Search (DFS) starting from any empty cell. We count the total number of empty cells (S) and then perform a reverse DFS traversal to mark (S - k) cells as 'safe'. Any empty cell not visited during this traversal is turned into a wall ('X'). The time complexity is O(N*M) and space complexity is O(N*M) for the grid and recursion stack.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
