# 1612-c

[Original practice problem](https://codeforces.com/problemset/problem/1612/C)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The total number of emotes in the triangle is k^2. If x >= k^2, the answer is 2k-1. Otherwise, we use binary search to find the number of messages. The sum of emotes for m messages is calculated in two parts: if m <= k, it's m*(m+1)/2. If m > k, it's k^2 - (2k-1-m)*(2k-m)/2. Binary search runs in O(log k) per test case, leading to O(t log k) total time complexity.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
