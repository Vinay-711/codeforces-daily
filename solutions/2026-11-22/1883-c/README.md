# 1883-c

[Original practice problem](https://codeforces.com/problemset/problem/1883/C)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**. Language: **Java**.

## Approach

The solution handles each value of k (2, 3, 4, 5) separately. For k=2, we check if any element is even. For k=3 and k=5, we find the minimum increments needed to make any element divisible by k. For k=4, we check if the product is already divisible by 4 (either one element divisible by 4 or at least two even elements). If not, we compute the minimum cost to either make one element divisible by 4 or make two elements even. The time complexity is O(n) per test case, and the space complexity is O(n) for storing the array.

## Verification

Solution generated in Java and verified Accepted on Codeforces by autonomous AI bot.
