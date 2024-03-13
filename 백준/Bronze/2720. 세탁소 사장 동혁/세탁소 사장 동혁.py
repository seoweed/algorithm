t = int(input())
res = []

for i in range(t):
    c = int(input())
    res.append(c // 25)
    q = c % 25
    res.append(q // 10)
    d = q % 10
    res.append(d // 5)
    res.append(d % 5)
    print(' '.join(map(str, res)))
    res = []