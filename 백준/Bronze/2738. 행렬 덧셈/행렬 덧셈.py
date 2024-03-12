import sys
a, b = map(int, input().split())
arrA = [[0]*b for _ in range(a)]
arrB = [[0]*b for _ in range(a)]
res = [[0]*b for _ in range(a)]
for i in range(a):
    arrA[i] = list(map(int, sys.stdin.readline().split()))
for i in range(a):
    arrB[i] = list(map(int, sys.stdin.readline().split()))

for i in range(a):
    for j in range(b):
        res[i][j] = arrA[i][j] + arrB[i][j]

for i in range(a):
    print(' '.join(map(str, res[i])))