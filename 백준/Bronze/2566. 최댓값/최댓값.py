import sys
arr = [[0]*9 for _ in range(9)]
lst = []

for i in range(9):
    arr[i] = list(map(int, sys.stdin.readline().split()))
for i in range(9):
    lst.append(max(arr[i]))
m = max(lst)
index = lst.index(max(lst))
print(m)
print(index + 1, arr[index].index(m) + 1)


