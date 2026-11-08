# 478-b

[Original practice problem](https://codeforces.com/problemset/problem/478/B)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize pairs, distribute participants as evenly as possible among m teams. Each team will have n/m participants, with (n % m) teams having (n/m + 1) participants. To maximize pairs, put all extra participants into one team, leaving m-1 teams with 1 participant each. Time complexity is O(1), space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
