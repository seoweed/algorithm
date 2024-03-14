import sys
lst = []
while 1:
    n = int(sys.stdin.readline())
    if n == -1:
        break
    for i in range(1, n):
        if n % i == 0:
            lst.append(i)
    if sum(lst) == n:
        print(n, '=',' + '.join(map(str, lst)))
    else:
        print(f'{n} is NOT perfect.')
    lst = []