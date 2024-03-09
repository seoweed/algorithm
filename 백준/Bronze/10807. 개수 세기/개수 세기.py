import sys

n = int(input())
lst = list(map(int, sys.stdin.readline().split()))
v = int(input())
result = 0

for i in range(n):
    if lst[i] == v :
        result = result + 1
print(result)