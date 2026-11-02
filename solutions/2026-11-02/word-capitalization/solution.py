def solve(word):
    return word[0].upper() + word[1:]

if __name__ == "__main__":
    print(solve(input().strip()))
