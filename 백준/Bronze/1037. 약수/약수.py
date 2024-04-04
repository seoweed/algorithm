import sys
input = sys.stdin.readline
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
if n % 2 == 0:
    print(lst[0] * lst[-1])
else:
    print(lst[n // 2] ** 2)