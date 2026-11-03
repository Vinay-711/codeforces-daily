# Xenia and Tree

Codeforces 342E, difficulty 2400. [Archived problem](https://codeforces.com/problemset/problem/342/E)

**Accepted** on November 4, 2026 (Asia/Kolkata). [Judge record](https://codeforces.com/contest/342/submission/397269728)

## Approach

Build a centroid decomposition and store each node's distance to its centroid ancestors. For each centroid, track the shortest distance to a red node that shares that ancestor. Painting a node updates the entries along its ancestor chain. A query minimizes the sum of the two distances through each shared centroid. At the decomposition level where the query node and its nearest red node split, the centroid lies on their path, so one of these candidates is exact.

The construction takes O(n log n) time and space. Each operation takes O(log n) time. Iterative component traversals handle chains without recursion proportional to n.

## Verification

Run `python3 test_solution.py` in this folder. The harness includes the published sample, randomized comparisons with BFS, and a 100,000-node path.
