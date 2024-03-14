n = int(input())
in_lst = list(map(int, input().split()))
res = 0

for a in in_lst:
    lst = []
    if a == 1:
        continue
    for i in range(1, a):
        if a % i == 0:
            lst.append(i)
    if len(lst) == 1:
        res += 1
    lst = []
print(res)