lst = list(map(int, input().split()))
res = []

res.append((lst[0] - 1) * -1)
res.append((lst[1] - 1) * -1)
res.append((lst[2] - 2) * -1)
res.append((lst[3] - 2) * -1)
res.append((lst[4] - 2) * -1)
res.append((lst[5] - 8) * -1)

print(' '.join(map(str,res)))
