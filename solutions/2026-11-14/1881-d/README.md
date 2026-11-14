# 1881-d

[Original practice problem](https://codeforces.com/problemset/problem/1881/D)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

The problem asks if we can redistribute prime factors among elements to make them equal. This is possible if and only if the total count of each prime factor across all numbers is divisible by n. We precompute primes up to 10^6 using a sieve, then for each test case, count the frequency of each prime factor in the input array. If every frequency is divisible by n, output YES, otherwise NO. Time complexity: O(MAX_A log log MAX_A + T * N * log(MAX_A)), space complexity: O(MAX_A).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
