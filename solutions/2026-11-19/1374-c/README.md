# 1374-c

[Original practice problem](https://codeforces.com/problemset/problem/1374/C)

Date: 2026-11-19 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

The scan counts unmatched closing brackets that cause a negative prefix balance. Each such bracket needs one move, so answer = number of times balance goes below zero. Time complexity O(n) per test case, total O(t·n) ≤ 1e5. Extra space O(1).

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
