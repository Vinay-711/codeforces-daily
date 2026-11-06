# 433-b

[Original practice problem](https://codeforces.com/problemset/problem/433/B)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To solve this problem efficiently, we use prefix sums for both the original array and the sorted array. By precomputing prefix sums, each query can be answered in O(1) time. Sorting the array takes O(n log n), and prefix sum calculation takes O(n). Total time complexity is O(n log n + m), and space complexity is O(n). We use long to prevent overflow as stone costs can be up to 10^9 and n up to 10^5.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
