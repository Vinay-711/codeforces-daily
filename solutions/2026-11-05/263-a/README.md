# 263-a

[Original practice problem](https://codeforces.com/problemset/problem/263/A)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for the Manhattan distance from the position of the '1' to the center of the 5x5 matrix (3, 3). Since we can only swap adjacent rows or columns, the minimum number of moves is |row - 3| + |col - 3|. The time complexity is O(1) as the matrix size is fixed at 5x5, and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
