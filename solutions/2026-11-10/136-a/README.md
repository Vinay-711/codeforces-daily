# 136-a

[Original practice problem](https://codeforces.com/problemset/problem/136/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks us to invert a permutation. Given an array where the i-th element represents the recipient of a gift from friend i+1, we need to find who gave a gift to each friend. We create an array 'result' of size n, and for each input value p_i at index i, we set result[p_i - 1] = i + 1. The time complexity is O(n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
