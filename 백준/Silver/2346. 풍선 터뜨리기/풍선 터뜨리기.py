import sys
from collections import deque

input = sys.stdin.readline
n = int(input())
lst = list(map(int, input().split()))
res_lst = []
a = deque(range(1, n+1))
for _ in range(n):
    k = a.popleft()
    print(k, end=' ')
    idx = k - 1
    if lst[idx] > 0:
        v = lst[idx] - 1
    else:
        v = lst[idx]
    val = v  * -1
    a.rotate(val)
