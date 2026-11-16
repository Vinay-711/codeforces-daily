# 1475-c

[Original practice problem](https://codeforces.com/problemset/problem/1475/C)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To count the number of valid pairs of couples (u, v) such that no boy or girl is shared, we calculate the total number of pairs of couples (k * (k - 1) / 2) and subtract invalid ones. A pair is invalid if they share a boy or a girl. For each couple i=(b_i, g_i), the number of invalid pairs involving i is (count_boy[b_i] - 1) + (count_girl[g_i] - 1). We sum these up and subtract from the total. Since each invalid pair is counted twice (once for each couple in the pair), we divide the sum of invalid counts by 2. Time complexity is O(k) per test case, space complexity is O(a + b + k).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
