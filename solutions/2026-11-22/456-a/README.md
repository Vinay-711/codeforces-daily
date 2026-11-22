# 456-a

[Original practice problem](https://codeforces.com/problemset/problem/456/A)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

Sorting by price makes cheaper laptops appear earlier. While scanning, if any later laptop has quality lower than the maximum quality seen among cheaper ones, the required pair exists. Time: O(n log n) due to sorting; Space: O(n) for the array.

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
