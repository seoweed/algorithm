t = int(input())
res = ''

for _ in range(t):
    r, s = input().split()
    for i in s:
        res = res + i * int(r)
    print(res)
    res = ''
