import sys
import math

input = sys.stdin.readline
n = int(input())

lst = []
for _ in range(n):
    lst.append(int(input()))

sub_lst = []
for i in range(n-1):
    sub_lst.append(lst[i+1] - lst[i])

num = sub_lst[0]
for i in range(len(sub_lst)):
    num = math.gcd(num, sub_lst[i])
    
res = 0
for i in range(n-1):
    if lst[i] + num != lst[i+1]:
        res += ((lst[i+1] - lst[i]) // num -1)
        
print(res)