import sys
input = sys.stdin.readline
s_lst = []
t_lst = []
res = 0
n, m = map(int, input().split())
for i in range(n):
    s_lst.append(input())

for i in range(m):
    t_lst.append(input())
 
for i in t_lst:
    if i in s_lst:
        res += 1
print(res)