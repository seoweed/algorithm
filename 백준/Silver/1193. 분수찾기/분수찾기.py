x = int(input())
i = 1
idx = 1

while 1:
    if i >= x:
        a = i - x
        if idx % 2 == 1:
            j = idx - a
            k = 1 + a
            break
        else:
            j = 1 + a
            k = idx - a
            break
    else:
        idx += 1
        i += idx
print(f'{k}/{j}')