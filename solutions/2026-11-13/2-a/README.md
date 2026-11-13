# 2-a

[Original practice problem](https://codeforces.com/problemset/problem/2/A)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved in two passes. First, we calculate the final scores of all players to determine the maximum score 'm'. Second, we iterate through the rounds again, maintaining running totals for each player. The winner is the first player who reaches or exceeds 'm' while having a final score equal to 'm'. Time complexity is O(N), space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
