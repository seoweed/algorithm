n = int(input())
str_n = input()
lst = []
res = 0

for i in range(n):
    lst.append(int(str_n[i]))

for i in lst:
    res = res + i
print(res)