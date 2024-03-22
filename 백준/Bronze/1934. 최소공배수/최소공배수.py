import sys

def Euclidean(a, b):
    while 1:
        r = a % b
        if r == 0:
            return b
        else:
           a = b
           b = r
           
input = sys.stdin.readline
n = int(input())

for _ in range(n):
    lst = list(map(int, input().split()))
    lst.sort(reverse=True)
    a = Euclidean(lst[0], lst[1])
    print(lst[0] * lst[1] // a)