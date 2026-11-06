# 489-b

[Original practice problem](https://codeforces.com/problemset/problem/489/B)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using a greedy approach. First, sort both the boys' and girls' skill arrays. Iterate through the sorted arrays and match a boy and a girl if the absolute difference of their skills is at most 1. If they match, increment the pair count and move to the next boy and girl. If the boy's skill is smaller, move to the next boy; otherwise, move to the next girl. Time complexity is O(N log N + M log M) due to sorting, and space complexity is O(N + M) to store the skills.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
