# 466-c

[Original practice problem](https://codeforces.com/problemset/problem/466/C)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem requires splitting an array into three contiguous parts with equal sums. First, calculate the total sum S. If S is not divisible by 3, the answer is 0. Otherwise, the target sum for each part is S/3. We iterate through the array, maintaining a prefix sum. We count how many times the prefix sum equals S/3. For every index where the prefix sum equals 2*S/3, we add the count of previously encountered S/3 prefix sums to our total. Time complexity is O(n) and space complexity is O(n) to store the array.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
