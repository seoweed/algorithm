from collections import deque
import sys

input = sys.stdin.readline
n = int(input())
a = deque()
for _ in range(n):
    s = input().strip()
    if s == '3':
        if len(a) == 0:
            print(-1)
        else:
            print(a.popleft())
    elif s == '4':
        if len(a) == 0:
            print(-1)
        else:
            print(a.pop())
    elif s == '5':
        print(len(a))
    elif s == '6':
        if len(a) == 0:
            print(1)
        else:
            print(0)
    elif s == '7':
        if len(a) == 0:
            print(-1)
        else:
            print(a[0])
    elif s == '8':
        if len(a) == 0:
            print(-1)
        else:
            print(a[-1])
    elif s[0] == '1':
        k, v = s.split()
        a.appendleft(v)
    else:
        k, v = s.split()
        a.append(v)
