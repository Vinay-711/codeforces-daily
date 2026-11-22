# 1791-d

[Original practice problem](https://codeforces.com/problemset/problem/1791/D)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

Pre‑compute distinct character counts for every prefix and suffix in O(n) time, then take the maximum sum of prefix[i] + suffix[i+1]. Overall time O(Σn) ≤ 2·10^5, memory O(n).

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
