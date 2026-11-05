# 492-b

[Original practice problem](https://codeforces.com/problemset/problem/492/B)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To light the entire street of length l, we sort the lantern positions in non-decreasing order. The required light radius d must satisfy three conditions: 1) d >= a[0] to cover [0, a[0]], 2) d >= l - a[n-1] to cover [a[n-1], l], and 3) d >= (a[i+1] - a[i]) / 2 for every adjacent pair of lanterns to cover the segment between them. The answer is the maximum of these lower bounds. We calculate double the maximum required distance using long integer arithmetic to avoid precision issues before dividing by 2.0. Time complexity is O(n log n) due to sorting, and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
