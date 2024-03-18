import sys
n = int(input())
lst = []

for _ in range(n):
    lst.append(int(sys.stdin.readline()))
lst.sort()
print('\n'.join(map(str, lst)))