# 1931-e

[Original practice problem](https://codeforces.com/problemset/problem/1931/E)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The game involves Anna removing trailing zeros by reversing numbers and Sasha concatenating numbers to preserve them. Each number's contribution to the final length is its total digits minus its trailing zeros. Anna wants to minimize the final length, while Sasha wants to maximize it. We count the trailing zeros for each number and sort them in descending order. Anna will greedily remove the largest counts of trailing zeros, and Sasha will effectively 'save' the remaining digits. The final length is the sum of all digits minus the zeros Anna successfully removes. Time complexity is O(N log N) due to sorting, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
