# 1335-d

[Original practice problem](https://codeforces.com/problemset/problem/1335/D)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To make a Sudoku grid anti-sudoku, we need to ensure every row, column, and 3x3 block has at least one duplicate. Since a valid Sudoku has all unique digits 1-9 in every row, column, and block, changing one digit in each of the 9 rows to a value that already exists in that row/column/block will satisfy the condition. A simple strategy is to change every occurrence of '1' to '2' in the grid. Since there is exactly one '1' in every row, column, and 3x3 block, changing it to '2' creates a duplicate '2' in each of those structures. This uses exactly 9 changes, satisfying the constraint.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
