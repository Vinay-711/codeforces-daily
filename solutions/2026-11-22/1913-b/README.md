# 1913-b

[Original practice problem](https://codeforces.com/problemset/problem/1913/B)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

The solution counts the total number of '0's and '1's in the string s. Then, it iterates through s from left to right to greedily match each character with the opposite type ('0' needs '1', and '1' needs '0'). If the required character is available, we decrement its count and reduce the cost (by reducing the matched length). If the required character is no longer available, we stop, and the remaining unmatched suffix represents the minimum cost. Time complexity: O(|s|) per test case. Space complexity: O(|s|).

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
