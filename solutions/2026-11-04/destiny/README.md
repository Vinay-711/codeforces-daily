# Destiny

[Codeforces 840D](https://codeforces.com/problemset/problem/840/D) — rating 2500.

**Prepared — not Accepted.** Java 21 solution tested locally; no accepted judge verdict is verified. Browser submission is unavailable because the browser tool reports local browser use is disabled.

## Approach

Build persistent segment trees for prefix value frequencies. Subtract two roots to obtain frequencies within a query interval. Prune any value interval whose total count does not exceed floor(length/k); search left first to find the smallest qualifying value. There are only O(k) unpruned intervals at each tree depth.

O(n log n + q k log n) time and O(n log n) space.

## Checks

12 randomized Java/reference comparisons passed for this solution. Run `python3 test_solution.py` for the original regression cases included here. Local tests do not establish a Codeforces verdict.
