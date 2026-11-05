# 371-c

[Original practice problem](https://codeforces.com/problemset/problem/371/C)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for the maximum number of hamburgers that can be made given a recipe, current inventory, prices, and a budget. Since the number of hamburgers is monotonic (if we can make X, we can make X-1), we use binary search on the answer. The range for binary search is [0, 2e12 + 100] to accommodate the budget and initial ingredients. For a given target number of hamburgers, we calculate the cost to buy the missing ingredients and check if it is within the budget. Time complexity is O(L + log(max_ans)), where L is the length of the recipe string.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
