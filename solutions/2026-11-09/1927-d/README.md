# 1927-d

[Original practice problem](https://codeforces.com/problemset/problem/1927/D)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To solve this problem efficiently, we precompute an array 'nextDiff' where nextDiff[i] stores the index of the first element to the right of i that is different from a[i]. This can be done in O(n) time by iterating backwards. For each query (l, r), we check if nextDiff[l] is within the range [l, r]. If it is, then (l, nextDiff[l]) is a valid pair of different elements. If not, no such pair exists in the range. The time complexity is O(n + q) and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
