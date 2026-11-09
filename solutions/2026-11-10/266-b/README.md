# 266-b

[Original practice problem](https://codeforces.com/problemset/problem/266/B)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved by simulating the queue transformation for t seconds. In each second, we iterate through the queue and swap 'BG' pairs to 'GB'. To avoid swapping the same person multiple times in a single second, we skip the index after a swap. The time complexity is O(n * t) and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
