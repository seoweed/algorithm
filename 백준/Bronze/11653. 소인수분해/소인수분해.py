n = int(input())
so_lst = []

lst = [True] * (n+1)
lst[0] = lst[1] = False

for i in range(2, int(n**0.5) + 1):
    if lst[i]:
        for j in range(i*i, n+1, i):
            lst[j] = False

for i in range(2, n+1):
    if lst[i]:
        so_lst.append(i)

i = 0
while n != 1:
    if n % so_lst[i] == 0:
        n = n // so_lst[i]
        print(so_lst[i])
    else:
        i += 1