# 1669-h

[Original practice problem](https://codeforces.com/problemset/problem/1669/H)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To maximize the bitwise AND of the array, we want to set as many high-order bits to 1 as possible. For each bit position from 30 down to 0, we count how many elements in the array currently have a 0 at that position. If the number of zeros is less than or equal to the remaining operations k, we can set all those bits to 1, decrement k by the count of zeros, and add 2^j to our result. Time complexity is O(N * 31) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
