# AI-assisted archived practice solution
def solve(data):
    a = list(map(int, data.split()))
    return str(sum(sum(a[i:i+3]) >= 2 for i in range(1,len(a),3)))

if __name__ == "__main__":
    import sys
    print(solve(sys.stdin.read()))
