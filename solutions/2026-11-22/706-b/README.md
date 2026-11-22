# 706-b

[Original practice problem](https://codeforces.com/problemset/problem/706/B)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

Sort prices once, then for each query use binary search to find the count of prices ≤ mi (upper bound). Time: O((n+q) log n), Space: O(n) for the sorted array.

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
