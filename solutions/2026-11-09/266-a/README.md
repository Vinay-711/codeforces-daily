# 266-a

[Original practice problem](https://codeforces.com/problemset/problem/266/A)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To ensure no two neighboring stones have the same color, we iterate through the string and count every instance where a stone is the same color as the one immediately preceding it. Each such instance requires removing one stone. The time complexity is O(n) and space complexity is O(n) to store the input string.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
