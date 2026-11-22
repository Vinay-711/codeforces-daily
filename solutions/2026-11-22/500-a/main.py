import sys

def solve():
    data = sys.stdin.read().strip().split()
    if not data:
        return
    n = int(data[0])
    t = int(data[1])
    a = list(map(int, data[2:]))
    cur = 1
    while cur < t:
        cur += a[cur-1]
    print("YES" if cur == t else "NO")

if __name__ == "__main__":
    solve()