# 160-a

[Original practice problem](https://codeforces.com/problemset/problem/160/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To minimize the number of coins taken while ensuring their sum is strictly greater than the remaining sum, we should always pick the largest available coins first. We sort the array in descending order, calculate the total sum, and iterate through the sorted coins, adding them to our current sum until it exceeds half of the total sum. Time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the coins.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
