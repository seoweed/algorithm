a ,b = map(str, input().split())

a = int(''.join(reversed(a)))
b = int(''.join(reversed(b)))

if a > b:
    print(a)
else:
    print(b)