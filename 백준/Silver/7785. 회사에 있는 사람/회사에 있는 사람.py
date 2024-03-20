import sys
input = sys.stdin.readline
n = int(input())
dic = {}
for _ in range(n):
    a, b = input().split()
    dic[a] = b

res_lst = []
for k,v in dic.items():
    if v == 'enter':
        res_lst.append(k)
res_lst.sort(reverse=True)
for i in res_lst:
    print(i)