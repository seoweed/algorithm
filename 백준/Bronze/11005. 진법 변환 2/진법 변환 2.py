n, b = map(int, input().split())
lst = []
res = []
a = n

while a >= b:
    lst.append(a % b)
    a = a // b
lst.append(a % b)
for i in lst:
    if i < 10:
        res.append(i)
    else:
        res.append(chr(i + 55))
res.reverse()
print(''.join(map(str,res)))