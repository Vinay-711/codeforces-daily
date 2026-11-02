from solution import solve
from functools import lru_cache
@lru_cache(None)
def best(m,n,mask=0):
    for i in range(m*n):
        if not mask >> i & 1:
            ans=best(m,n,mask | 1<<i)
            for j in (i+1 if i%n+1<n else -1, i+n):
                if 0<=j<m*n and not mask>>j&1:
                    ans=max(ans,1+best(m,n,mask|1<<i|1<<j))
            return ans
    return 0
for m in range(1,5):
    for n in range(m,5):
        assert solve(m,n)==best(m,n)
assert solve(2,4)==4 and solve(3,3)==4 and solve(16,16)==128
print("exhaustive small-board placement checks passed")
