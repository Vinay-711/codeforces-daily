# 1526-c2

[Original practice problem](https://codeforces.com/problemset/problem/1526/C2)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We use a greedy approach with a min-priority queue. We iterate through the potions, adding each to our current health. If health becomes negative, we remove the smallest (most negative) potion we have consumed so far from the priority queue and adjust our health accordingly. This ensures we always keep the maximum number of potions possible while maintaining non-negative health. Time complexity is O(n log n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
