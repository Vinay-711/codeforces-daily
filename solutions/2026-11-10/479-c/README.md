# 479-c

[Original practice problem](https://codeforces.com/problemset/problem/479/C)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize the final exam day while keeping the recorded dates (a_i) in non-decreasing order, we should process the exams in ascending order of their scheduled day (a_i). If two exams have the same scheduled day, we break ties by sorting them by their early day (b_i) in ascending order. We maintain `lastDay` representing the actual day the previous exam was taken. For each exam, we greedily attempt to take it on the early day `b_i` if `b_i >= lastDay`. If taking it on day `b_i` is impossible (i.e., `b_i < lastDay`), we must take it on day `a_i`. This greedy choice is optimal because taking an exam as early as possible leaves the maximum possible flexibility for subsequent exams.

Time Complexity: O(N log N) for sorting N exams.
Space Complexity: O(N) to store the exam pairs.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
