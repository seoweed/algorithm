import sys
n, m = map(int, input().split())
lst = list(range(1, n+1))

for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    for idx, a in enumerate(list(reversed(lst[i-1:j])), i-1):
        lst[idx] = a

res = " ".join(map(str, lst))
print(res)
