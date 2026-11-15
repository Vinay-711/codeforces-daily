# 545-d

[Original practice problem](https://codeforces.com/problemset/problem/545/D)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To maximize the number of satisfied people, we should sort the service times in non-decreasing order. We maintain a running sum of the time elapsed for all satisfied people. If the current person's service time is greater than or equal to the current elapsed time, they can be satisfied, and we add their service time to the elapsed time. Otherwise, they must be skipped. The time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the input.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
