s = input()
lst = list(-1 for _ in range(26))

for i in s:
    a = s.index(i)
    b = ord(i) - 97
    lst[b] = a
print(" ".join(map(str, lst)))
