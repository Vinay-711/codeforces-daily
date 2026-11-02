from solution import solve
for s,expected in [("ApPLe","ApPLe"),("konjac","Konjac"),("a","A"),("Z","Z"),("aBC","ABC"),("z"*1000,"Z"+"z"*999)]:
    assert solve(s)==expected
print("6 sample and edge cases passed")
