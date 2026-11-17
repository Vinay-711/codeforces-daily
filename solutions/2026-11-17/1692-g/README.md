# 1692-g

[Original practice problem](https://codeforces.com/problemset/problem/1692/G)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The condition 2^j * a_{i+j} < 2^{j+1} * a_{i+j+1} is equivalent to a_{i+j} < 2 * a_{i+j+1}. We can pre-calculate a boolean array where b[j] is true if a[j] < 2 * a[j+1]. A subarray of length k+1 starting at i satisfies the condition if all k adjacent pairs in that range satisfy the condition. This is equivalent to having a sequence of k consecutive 'true' values in the boolean array starting at index i. We use a sliding window or a simple counter to track consecutive 'true' values. Time complexity is O(n) per test case, space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
