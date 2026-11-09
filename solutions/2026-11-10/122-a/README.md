# 122-a

[Original practice problem](https://codeforces.com/problemset/problem/122/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Since n is small (up to 1000), we can pre-calculate all lucky numbers up to 1000 (4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777) and check if the input n is divisible by any of them. Time complexity is O(1) as the number of lucky numbers is constant, and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
