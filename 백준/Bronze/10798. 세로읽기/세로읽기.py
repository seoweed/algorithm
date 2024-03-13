import sys
lst = []
m = 0

for i in range(5):
    a = sys.stdin.readline().strip()
    lst.append(a)
    if m < len(a):
        m = len(a)

for i in range(m):
    for j in range(5):
        try:
            print(lst[j][i], end="")
        except IndexError:
            continue

