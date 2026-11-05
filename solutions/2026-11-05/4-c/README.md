# 4-c

[Original practice problem](https://codeforces.com/problemset/problem/4/C)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

We can use a HashMap to store registered names and their next available numeric suffix counter. When a name is requested:
1. If it's not in the map, print 'OK' and insert it into the map with an initial counter of 1.
2. If it is in the map, get its counter $k$. We increment $k$ until `name + k` is not present in the map. Then we print `name + k`, update the counter for `name` to $k + 1$, and register `name + k` in the map with counter 1.

Time Complexity: $O(N \cdot L)$ where $N$ is the number of requests and $L \le 32$ is the max string length, because each increment of $k$ corresponds to a unique existing string in the map.
Space Complexity: $O(N \cdot L)$ to store at most $2N$ strings in the HashMap, easily fitting within the 64 MB memory limit.

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
