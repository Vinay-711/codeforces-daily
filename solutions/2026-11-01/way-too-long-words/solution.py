import sys


def abbreviate(word):
    return word if len(word) <= 10 else f"{word[0]}{len(word)-2}{word[-1]}"


def solve(data):
    tokens = data.split()
    return "\n".join(abbreviate(w) for w in tokens[1:1+int(tokens[0])])


if __name__ == "__main__":
    print(solve(sys.stdin.read()))
