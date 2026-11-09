# 677-a

[Original practice problem](https://codeforces.com/problemset/problem/677/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks to calculate the total width of a group of people walking in a row. If a person's height is greater than the fence height h, they contribute 2 to the width; otherwise, they contribute 1. We iterate through the input array once, checking each person's height against h. The time complexity is O(n) and the space complexity is O(1) as we process the input on the fly.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
