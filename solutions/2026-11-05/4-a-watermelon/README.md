# 4A - Watermelon

[Original practice problem](https://codeforces.com/problemset/problem/4/A)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Language: **Java**.

## Approach

A watermelon can be divided into two even parts if and only if its total weight w is even and strictly greater than 2. For w = 2, the only split is 1 + 1 (neither even). For even w > 2, we can split into 2 and w - 2 (both positive even).

Complexity: O(1) time and O(1) space.

## Verification

Compiled with javac and verified against sample test cases locally.
