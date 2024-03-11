s = input()
res = len(s)
for i in s:
    if ord(i) <= 67:
         res = res + 2
    elif ord(i) <= 70:
         res = res + 3
    elif ord(i) <= 73:
         res = res + 4
    elif ord(i) <= 76:
         res = res + 5   
    elif ord(i) <= 79:
         res = res + 6
    elif ord(i) <= 83:
         res = res + 7
    elif ord(i) <= 86:
         res = res + 8
    elif ord(i) <= 90:
         res = res + 9
print(res)