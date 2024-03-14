a, b, v = map(int, input().split())
i = 0
if v == a:
    print(1)
else:
    temp = v - b
    if temp % (a -b) == 0:
        i += temp // (a -b)
    else:
        i += (temp // (a -b)) + 1
    print(i)