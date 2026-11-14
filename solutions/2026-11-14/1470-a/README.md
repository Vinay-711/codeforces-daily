# 1470-a

[Original practice problem](https://codeforces.com/problemset/problem/1470/A)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize the total cost, we should prioritize giving the cheapest available presents to the friends who have the highest k_i values. We sort the friends by their k_i in descending order. For each friend, we compare the cost of the cheapest available present (starting from the cheapest) with the cost of giving them c[k_i] dollars. If the present is cheaper, we give the present and move to the next cheapest; otherwise, we give them c[k_i] dollars. Time complexity is O(N log N + M) per test case due to sorting, and space complexity is O(N + M).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
