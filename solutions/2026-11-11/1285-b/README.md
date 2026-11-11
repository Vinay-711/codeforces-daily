# 1285-b

[Original practice problem](https://codeforces.com/problemset/problem/1285/B)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Yasser's total tastiness is the sum of all elements A. Adel can choose any proper subsegment [l, r] (not equal to [1, n]). A proper subsegment is formed by omitting a non-empty prefix, a non-empty suffix, or both. For Yasser's total to be strictly greater than any proper subsegment's total, every non-empty prefix sum (excluding the full array) and every non-empty suffix sum (excluding the full array) must be strictly positive (> 0). If any prefix sum p[1..k] <= 0 (for 1 <= k < n) or suffix sum s[k..n] <= 0 (for 1 < k <= n), then the remaining subsegment will have sum >= A, making Yasser unhappy. We can check this in O(n) time and O(1) auxiliary space.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
