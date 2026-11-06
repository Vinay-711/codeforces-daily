# 327-a

[Original practice problem](https://codeforces.com/problemset/problem/327/A)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To maximize the number of ones after flipping a range [i, j], we observe that flipping a 0 adds 1 to the total count, and flipping a 1 subtracts 1. We transform the array into a sequence where 0 becomes 1 and 1 becomes -1. The problem then becomes finding the maximum subarray sum (Kadane's algorithm). If the array contains only ones, we must flip at least one element, so we subtract 1 from the total count. Time complexity is O(n), space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
