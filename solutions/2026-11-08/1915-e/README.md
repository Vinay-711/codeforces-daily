# 1915-e

[Original practice problem](https://codeforces.com/problemset/problem/1915/E)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for a subarray where the sum of elements at odd indices equals the sum of elements at even indices. By assigning a sign to each element (positive for odd indices, negative for even indices), the condition becomes finding a subarray with a sum of 0. We can compute prefix sums of these signed values and check if any prefix sum repeats or equals 0, which indicates a subarray sum of 0. We use a HashSet to store seen prefix sums. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
