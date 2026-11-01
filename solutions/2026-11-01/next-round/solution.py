# AI-assisted archived practice solution
def solve(data):
    a = list(map(int, data.split()))
    n, k = a[:2]
    scores = a[2:2+n]
    return str(sum(x > 0 and x >= scores[k-1] for x in scores))

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))
