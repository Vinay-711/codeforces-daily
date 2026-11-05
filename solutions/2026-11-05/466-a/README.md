# 466-a

[Original practice problem](https://codeforces.com/problemset/problem/466/A)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem is solved by comparing the cost of buying individual tickets versus buying m-ride tickets. We calculate the cost using three strategies: 1) buying only single tickets, 2) buying as many m-ride tickets as possible and covering the remainder with single tickets, and 3) buying enough m-ride tickets to cover all n rides (potentially buying more than n). The minimum of these is the answer. Time complexity is O(1) and space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
