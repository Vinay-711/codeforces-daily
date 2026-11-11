# 1195-c

[Original practice problem](https://codeforces.com/problemset/problem/1195/C)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We can solve this problem using dynamic programming in O(n) time and O(1) auxiliary space. For each column from left to right, we maintain three states: 'dp0' (maximum total height up to the current column if no player is chosen from this column), 'dp1' (maximum height if the player from the first row is chosen), and 'dp2' (maximum height if the player from the second row is chosen). To transition to column i: dp0 is the max of previous states (dp0, dp1, dp2); dp1 is max(previous dp0, previous dp2) + height of student in row 1; and dp2 is max(previous dp0, previous dp1) + height of student in row 2. The maximum of the final states gives the answer.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
