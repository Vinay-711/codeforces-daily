from solution import abbreviate, solve
for length in range(1, 101):
    word = 'a' + 'b' * (length-1)
    expected = word if length <= 10 else 'a' + str(length-2) + 'b'
    assert abbreviate(word) == expected
assert solve('3\nshort\nabcdefghij\nabcdefghijk\n') == 'short\nabcdefghij\na9k'
print('101 checks passed')
