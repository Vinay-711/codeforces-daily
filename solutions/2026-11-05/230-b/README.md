# 230-b

[Original practice problem](https://codeforces.com/problemset/problem/230/B)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

A number has exactly three divisors if and only if it is the square of a prime number. We precompute primes up to 10^6 using a sieve to check if the square root of each input number is prime. Time complexity is O(M log log M + N) where M=10^6 and N=10^5. Space complexity is O(M).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
