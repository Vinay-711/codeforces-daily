# AI-assisted archived practice solution
import sys
words = sys.stdin.read().split()
for word in words[1:1 + int(words[0])]:
    print(word if len(word) <= 10 else f"{word[0]}{len(word)-2}{word[-1]}")
