from solution import solve
for w in range(1,101):
    possible = any(a%2 == 0 and (w-a)%2 == 0 for a in range(1,w))
    assert solve(w) == ("YES" if possible else "NO"), w
print("100 independent partition cases passed")
