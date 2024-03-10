import sys
n, m = map(int, input().split())
lst = [0 for _ in range(n)]
result = ""

for _ in range(m):
    i, j, k = map(int, sys.stdin.readline().split())
    for a in range(i-1 , j):
        lst[a] = k
    
for i in lst:
    result = result + f'{i} '

print(result)