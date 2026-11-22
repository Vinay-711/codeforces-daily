# 379-a

[Original practice problem](https://codeforces.com/problemset/problem/379/A)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

The solution simulates the process of burning candles and exchanging burnt ones for new ones. We keep track of the total hours and the number of burnt candles. In each iteration, we burn all available candles, add to the total hours and burnt count, then exchange as many burnt candles as possible for new ones. The loop continues until no more candles are available. The time complexity is O(log_b(a)) which is very efficient for the given constraints.

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
