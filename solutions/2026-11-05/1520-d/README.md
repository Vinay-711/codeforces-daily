# 1520-d

[Original practice problem](https://codeforces.com/problemset/problem/1520/D)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The equation a[j] - a[i] = j - i can be rearranged to a[j] - j = a[i] - i. By transforming the array such that each element b[i] = a[i] - i, the problem reduces to finding the number of pairs (i, j) with i < j such that b[i] = b[j]. This is solved by counting the frequency of each value in the transformed array using a HashMap and calculating n*(n-1)/2 for each frequency. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
