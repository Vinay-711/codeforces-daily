# 1365-b

[Original practice problem](https://codeforces.com/problemset/problem/1365/B)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

If the array is already sorted, the answer is 'Yes'. If it is not sorted, we can sort it if and only if we have at least one element of type 0 and at least one element of type 1. This is because having both types allows us to perform any permutation of the array elements via swaps. Time complexity is O(N log N) or O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
