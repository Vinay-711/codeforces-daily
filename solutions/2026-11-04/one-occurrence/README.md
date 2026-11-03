# One Occurrence

[Codeforces 1000F](https://codeforces.com/problemset/problem/1000/F) — rating 2400.

**Prepared — not Accepted.** Java 21 solution tested locally; no accepted judge verdict is verified. Browser submission is unavailable because the browser tool reports local browser use is disabled.

## Approach

Sweep queries by their right endpoint. Keep only the latest occurrence of each value active in a segment tree, storing its previous occurrence. A minimum previous occurrence smaller than the query left boundary identifies a value occurring exactly once. Otherwise return zero.

O((n+q) log n) time and O(n+q+V) space, where V is the value bound.

## Checks

12 randomized Java/reference comparisons passed for this solution. Run `python3 test_solution.py` for the original regression cases included here. Local tests do not establish a Codeforces verdict.
