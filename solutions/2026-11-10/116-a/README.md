# 116-a

[Original practice problem](https://codeforces.com/problemset/problem/116/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem requires tracking the current number of passengers in the tram at each stop. We maintain a running sum by subtracting exiting passengers and adding entering passengers at each stop. The minimum capacity is the maximum value this running sum reaches during the process. Time complexity is O(n) and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
