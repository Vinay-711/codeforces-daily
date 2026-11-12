# 25-a

[Original practice problem](https://codeforces.com/problemset/problem/25/A)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.
Submission ID: `398356947`

## Approach

We use a FastScanner to read the inputs. Since there is always a majority of either even or odd numbers and exactly one number of the opposite parity, we can check the parity of the first three numbers to determine the majority parity. Then we iterate through the array and find the index (1-based) of the number that does not match the majority parity. Time complexity is O(N) and space complexity is O(N) to store the numbers.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
