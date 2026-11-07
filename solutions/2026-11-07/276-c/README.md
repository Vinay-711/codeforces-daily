# 276-c

[Original practice problem](https://codeforces.com/problemset/problem/276/C)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To maximize the total sum of queries, we need to assign the largest values in the array to the indices that are covered by the most queries. We use a difference array to count how many times each index is included in the queries in O(n + q) time. Then, we sort the frequency counts and the original array elements. Finally, we compute the sum of products of the sorted frequencies and sorted array elements. Time complexity is O(n log n + q), space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
