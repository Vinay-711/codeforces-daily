# 1352-d

[Original practice problem](https://codeforces.com/problemset/problem/1352/D)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We can directly simulate the game using a two-pointer approach (one pointer `left` starting at 0 for Alice, and `right` starting at `n - 1` for Bob). We keep track of the number of moves, the total candies eaten by Alice and Bob, and the amount of candies eaten in the most recent move. In each move, the current player eats candies from their respective end until the sum of candies eaten in this move strictly exceeds the amount eaten by the opponent in the previous move or until no candies remain. Since each candy is eaten at most once, the simulation runs in O(n) time per testcase.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
