# 474-b

[Original practice problem](https://codeforces.com/problemset/problem/474/B)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We compute the prefix sums of the pile sizes to determine the range of labels for each pile. Since the prefix sums are strictly increasing, we can use binary search (specifically Arrays.binarySearch) to find the index of the pile for each query in O(log n) time. Total time complexity is O(n + m log n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
