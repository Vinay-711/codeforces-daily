# 514-a

[Original practice problem](https://codeforces.com/problemset/problem/514/A)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The approach is to iterate through the digits of the input number, which is read as a string due to its potential size (up to 10^18). For each digit, we want to choose the smaller value between the digit itself and its inverse (9 - digit) to minimize the overall number. A special condition applies to the first digit: if the first digit is '9', inverting it would result in '0', which is not allowed as a leading zero. Therefore, if the first digit is '9', it must be kept as '9'. For any other first digit (1-8), and for all subsequent digits, we simply choose `Math.min(digit, 9 - digit)`. The resulting digits are appended to a `StringBuilder` to form the final minimum number. The time complexity is O(L) where L is the number of digits in the input number, as we process each digit once. The space complexity is O(L) for storing the input string and the result in a `StringBuilder`.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
