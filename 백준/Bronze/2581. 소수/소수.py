m = int(input())
n = int(input())
in_lst = list(range(m, n+1))
res = []

for a in in_lst:
    lst = []
    if a == 1:
        continue
    for i in range(1, a):
        if a % i == 0:
            lst.append(i)
    if len(lst) == 1:
        res.append(a)
if len(res) == 0:
    print(-1)
else:
    print(sum(res))
    print(res[0])