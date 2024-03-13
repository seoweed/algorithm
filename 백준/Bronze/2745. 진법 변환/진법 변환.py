n, b = input().split()
lst = []
res = 0

for i in n:
    try:
        lst.append(int(i))
    except ValueError:
        a = ord(i) - 55
        lst.append(a)

for i in range(len(lst)): 
    res += lst[i] * int(b) ** (len(lst)-i-1)
    
print(res)