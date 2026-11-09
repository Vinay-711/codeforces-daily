# 271-a

[Original practice problem](https://codeforces.com/problemset/problem/271/A)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks for the smallest year strictly greater than the input year with all distinct digits. Since the input range is small (1000 to 9000), we can simply increment the year and check each one by converting it to a string or extracting digits to verify uniqueness. The time complexity is O(N * D) where N is the number of years checked (very small) and D is the number of digits (4). Space complexity is O(1).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
