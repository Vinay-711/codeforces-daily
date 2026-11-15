# 1520-e

[Original practice problem](https://codeforces.com/problemset/problem/1520/E)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize moves, we identify the positions of all sheep. If there are k sheep at indices p[0], p[1], ..., p[k-1], we want to move them to a contiguous block starting at some position x. The optimal target position for the median sheep is its current position, and all other sheep should be placed relative to it. Specifically, if we align the sheep such that the i-th sheep (in order) ends up at position (x + i), the cost is sum(|p[i] - (x + i)|). By defining q[i] = p[i] - i, the problem reduces to finding x that minimizes sum(|q[i] - x|), which is the median of the array q. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
