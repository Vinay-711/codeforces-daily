# Ciel and Gondolas

[Codeforces 321E](https://codeforces.com/problemset/problem/321/E) — rating 2600.

**Prepared — not Accepted.** Java 21 solution tested locally; no accepted judge verdict is verified. Browser submission is unavailable because the browser tool reports local browser use is disabled.

## Approach

Use a square prefix-sum table to evaluate the pair cost of a contiguous group in constant time. Dynamic programming chooses the final split for each prefix and group count. Nonnegative pair costs give monotone optimal split positions, allowing divide-and-conquer optimization of each DP layer. Divide the square sum by two because the matrix contains both directions of every pair.

O(n² + k n log n) time and O(n²+n) space.

## Checks

12 randomized Java/reference comparisons passed for this solution. Run `python3 test_solution.py` for the original regression cases included here. Local tests do not establish a Codeforces verdict.
