# 368-b

[Original practice problem](https://codeforces.com/problemset/problem/368/B)

Date: 2026-11-23 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

We precompute the number of distinct elements in each suffix of the array by iterating from right to left. We maintain a boolean array to track which values have been seen and a counter for the number of distinct elements. For each position i, if the element at i hasn't been seen before, we increment the counter. The answer for each query l_i is simply the precomputed value at index l_i. Time complexity is O(n + m) and space complexity is O(n + max_a).

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
