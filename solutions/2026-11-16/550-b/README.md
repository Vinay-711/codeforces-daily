# 550-b

[Original practice problem](https://codeforces.com/problemset/problem/550/B)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Since n is small (up to 15), we can iterate through all 2^n possible subsets using bitmasking. For each subset, we check if it contains at least two problems, calculate the sum of difficulties, and find the min and max difficulty. If the sum is within [l, r] and the difference between max and min is at least x, we increment the count. Time complexity is O(2^n * n), space complexity is O(n).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
