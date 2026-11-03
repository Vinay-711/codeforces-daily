# Codeforces Daily Practice

Practice solutions, explanations and verification records maintained by the daily routine scheduled for **15:00 Asia/Kolkata**.

## Layout

Each completed problem belongs in `solutions/YYYY-MM-DD/problem-slug/` with:

- A solution file in Java, Python or C++.
- `README.md` linking the original problem and explaining the approach, complexity, test cases and actual judge status.
- Small original test fixtures or a runnable test harness where appropriate.

The daily index is `solutions/YYYY-MM-DD/README.md`. Submission records should link to the judge result when available. Use `Accepted` only after the platform confirms it; otherwise label the result `Prepared`, `Blocked`, `Wrong Answer` or the actual verdict.

## Practice boundaries

Use archived, unrated practice problems where platform rules permit assistance and publication. Do not publish active contest, exam, hiring assessment or certification solutions. Link the source problem instead of copying its full statement. Never commit cookies, credentials, personal data or browser sessions.

Commit only substantive new or corrected solutions and their verification records. Do not generate empty commits, backdate work or claim a solve that was not verified. A blocked day may produce a locally tested prepared solution, clearly labeled as such, but does not count as an accepted platform submission.

## Practice index

| Date (Asia/Kolkata) | Problem folders |
| --- | ---: |
| [2026-11-04](solutions/2026-11-04/README.md) | 7 accepted + 3 prepared in the hard practice set |
| [2026-11-03](solutions/2026-11-03/README.md) | 5 accepted; 0 in hard-only set |
| [2026-11-02](solutions/2026-11-02/README.md) | 3 accepted |
| [2026-11-01](solutions/2026-11-01/README.md) | 3 |

## Run local checks

Run the harnesses with Python 3. C++ harnesses also require a C++17 compiler.

```sh
python3 solutions/2026-11-01/next-round/test_solution.py
python3 solutions/2026-11-01/team/test_solution.py
python3 solutions/2026-11-01/way-too-long-words/test_solution.py
```

Run commands from the repository root. These checks validate local cases; the linked platform submission records are the evidence for judge verdicts. Review each problem’s README for its approach, complexity and actual result.

## Automation status

The recurring schedule is managed outside GitHub. This repository contains solution work, not a self-running submission bot; its contents do not guarantee that tomorrow’s run will execute. Practice solutions may be AI-assisted. Do not use assistance in a contest or assessment that prohibits it.

## Continuous regression checks

Run `python3 scripts/check_solutions.py` to discover and execute every Python
`test_*.py` harness below `solutions/`, including future dated folders. A failure,
timeout, or missing harness set returns a nonzero exit code. Pull requests and
pushes to `main` run the same command in GitHub Actions on Python 3.12.

This checks the committed local cases only. It does not submit code to a platform,
claim a new accepted result, or guarantee the daily external scheduler runs.
