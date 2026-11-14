# 816-b

[Original practice problem](https://codeforces.com/problemset/problem/816/B)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved using a difference array to count the number of recipes covering each temperature, followed by a prefix sum array to answer range queries in O(1) time. The difference array approach takes O(N + M) where M is the maximum temperature (200,000), and prefix sum calculation takes O(M). Each query is answered in O(1), leading to a total time complexity of O(N + M + Q) and space complexity of O(M).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
