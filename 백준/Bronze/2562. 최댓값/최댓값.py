lst = []
for i in range(9):
    lst.append(int(input()))
m = max(lst)
print(m)
print(lst.index(m) + 1)