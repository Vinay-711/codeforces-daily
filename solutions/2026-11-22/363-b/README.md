# 363-b

[Original practice problem](https://codeforces.com/problemset/problem/363/B)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

Sliding window keeps sum of current k‑length segment. Update in O(1) while moving right, track minimal sum and its start index. Overall O(n) time, O(1) extra memory.

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
