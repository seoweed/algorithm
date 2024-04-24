import sys
input = sys.stdin.readline
t = int(input())
for _ in range(t):
    s = input().rstrip()
    a = 0
    res = 0
    for i in s:
        if i == 'O':
            a += 1
            res += a
        else:
            a = 0
    print(res)