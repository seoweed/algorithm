import sys
input = sys.stdin.readline
n = int(input())
lst = []

for _ in range(n):
    lst.append(int(input()))
lst.sort()
print('\n'.join(map(str,lst)))