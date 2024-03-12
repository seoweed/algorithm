n = int(input())
s = 2 * n - 1
for idx, i in enumerate(range(1,s+1,2)):
    print(' ' * (n-1-idx) + '*' * i)
for idx, i in enumerate(range(s-2,0,-2)):
    print(' ' * (idx+1) + '*' * i)
