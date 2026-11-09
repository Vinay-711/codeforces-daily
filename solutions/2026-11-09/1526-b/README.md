# 1526-b

[Original practice problem](https://codeforces.com/problemset/problem/1526/B)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Any number x can be represented as 11*a + 111*b. Since 111 = 10*11 + 1, we can rewrite x = 11*(a + 10*b) + b. This implies that if x can be represented as a sum of 11s and 111s, then x - 111*b must be non-negative and divisible by 11 for some b. Since 111*11 = 1221, we only need to check b from 0 to 10. Time complexity is O(T) and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
