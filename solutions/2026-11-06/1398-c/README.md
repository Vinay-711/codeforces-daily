# 1398-c

[Original practice problem](https://codeforces.com/problemset/problem/1398/C)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The condition sum(a[l...r]) = r - l + 1 can be rewritten as sum(a[l...r]) - (r - l + 1) = 0. Let P[i] be the prefix sum of (a[k] - 1) for k from 1 to i. Then the condition becomes P[r] - P[l-1] = 0, or P[r] = P[l-1]. We use a frequency map to count occurrences of each prefix sum value encountered so far. For each index, the number of good subarrays ending at that index is the number of times the current prefix sum has appeared previously. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
