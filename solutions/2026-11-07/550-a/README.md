# 550-a

[Original practice problem](https://codeforces.com/problemset/problem/550/A)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks to find if 'AB' and 'BA' exist without overlapping. We check two scenarios: 1) Find the first 'AB' and then search for 'BA' after it, and 2) Find the first 'BA' and then search for 'AB' after it. If either scenario succeeds, the answer is YES. Time complexity is O(N) and space complexity is O(N) to store the string.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
