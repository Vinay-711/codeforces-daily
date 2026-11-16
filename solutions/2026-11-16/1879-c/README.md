# 1879-c

[Original practice problem](https://codeforces.com/problemset/problem/1879/C)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To make the string alternating, we must remove all but one character from every consecutive block of identical characters. If a block has length L, we must remove L-1 characters. The total number of operations is the sum of (L-1) for all blocks. The number of ways to choose which characters to remove is the product of the sizes of these blocks (since for a block of size L, we choose 1 to keep out of L, which is L ways) multiplied by the factorial of the total number of operations (since the order of deletions matters). Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
