# domino-piling — Accepted

Problem: https://codeforces.com/problemset/problem/50/A

AI-assisted archived practice. Each tile consumes two cells, bounding the answer by floor(area/2). Pair along an even dimension; when both are odd, tile all but the last row and pair cells in that row, leaving one cell. Time O(1), space O(1).

Judge verdict: **Accepted**. [Submission 397141890](https://codeforces.com/problemset/submission/50/397141890), verified through the official Codeforces user.status API on November 2, 2026.

Tested exact maximum tiling search for all rectangles up to 4 by 4, both samples, and 16 by 16. Submitted by the user after anti-bot verification; final judge verdict confirmed.
