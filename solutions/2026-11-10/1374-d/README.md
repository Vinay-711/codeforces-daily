# 1374-d

[Original practice problem](https://codeforces.com/problemset/problem/1374/D)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To make an element a_i divisible by k, we need to add r = (k - (a_i % k)) % k to it. If r = 0, no addition is needed. For each remainder r > 0, if there are 'cnt' elements requiring remainder r, the operations for remainder r will occur at moves x = r, r + k, r + 2k, ..., r + (cnt - 1) * k. The operation at move x increases x to x + 1, taking x + 1 moves in total. Thus, the total moves required for a remainder group r is (cnt - 1) * k + r + 1. The maximum over all required remainders gives the minimum total moves required. We sort non-zero remainders to count their frequencies efficiently in O(N log N) time.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
