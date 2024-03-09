import sys

n, x = map(int, input().split())
lst = list(map(int, sys.stdin.readline().split()))
result = ""

for i in range(n):
    if lst[i] < x :
        result = result + str(lst[i]) + " "
print(result)