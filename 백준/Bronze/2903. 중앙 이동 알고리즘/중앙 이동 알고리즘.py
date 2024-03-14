def cal(l,n):
    if n == 0:
        return 4
    elif n == 1:
        return 9
    a = cal(2**(n-2), n-1)
    b = ((l*l) * 3)
    c = (2*l)

    res = a + b + c
    return res

n = int(input())
l = 2**(n-1)
print(cal(l,n))