import sys
s = 0
h = 0

dic = {'A+':4.5, 'A0':4.0, 'B+':3.5, "B0":3.0, "C+":2.5, "C0":2.0, "D+" :1.5, "D0":1.0, "F":0.0}
for i in range(20):
    lst = list(map(str, sys.stdin.readline().split()))
    if lst[2] != 'P':
        s = s + (float(lst[1]) * dic[lst[2]])
        h = h + float(lst[1])
print(s/h)