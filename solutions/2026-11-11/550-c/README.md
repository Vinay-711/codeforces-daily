# 550-c

[Original practice problem](https://codeforces.com/problemset/problem/550/C)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

Any integer is divisible by 8 if and only if its last 3 digits form a number divisible by 8. Thus, if any valid number divisible by 8 can be formed by deleting digits from $n$, there must exist a subsequence of length 1, 2, or 3 (without leading zeroes, except for the single digit '0') that is divisible by 8. We can check all subsequences of length 1, 2, and 3 in $O(|N|^3)$ time. Given $|N| \le 100$, this takes fewer than $2 \times 10^5$ operations, which is well within the 2-second time limit.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
