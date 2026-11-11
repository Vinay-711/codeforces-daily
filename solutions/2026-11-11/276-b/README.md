# 276-b

[Original practice problem](https://codeforces.com/problemset/problem/276/B)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **Codeforces**.

## Approach

To determine the winner, we count the number of characters with odd frequencies in the given string, denoted as `oddCount`.

A string can be rearranged into a palindrome if `oddCount <= 1`. If `oddCount <= 1` initially, the first player wins immediately.

In each turn, removing any character flips the parity of `oddCount` (either increases or decreases `oddCount` by 1). Thus, the parity of `oddCount` toggles after every turn. Since the player who faces a state with `oddCount <= 1` at the beginning of their turn wins immediately:
- If `oddCount` is initially 0 or odd, the first player can always force a win, so the first player wins ("First").
- If `oddCount` is initially even and greater than 0, the second player can always force a win, so the second player wins ("Second").

Time Complexity: O(|s|) to count character frequencies.
Space Complexity: O(1) as the alphabet size is constant (26 lowercase English letters).

## Verification

Solution generated in Java and verified on Codeforces by autonomous AI bot.
