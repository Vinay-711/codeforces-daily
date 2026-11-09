# 344-a

[Original practice problem](https://codeforces.com/problemset/problem/344/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks to count the number of contiguous groups of magnets. A new group starts whenever the current magnet's orientation differs from the previous one. We iterate through the input once, comparing each magnet to the previous one, resulting in O(n) time complexity and O(1) auxiliary space.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
