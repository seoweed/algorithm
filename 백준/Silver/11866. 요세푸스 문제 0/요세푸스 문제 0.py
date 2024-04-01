from collections import deque
n , k = map(int, input().split())
a = deque(range(1, n+1))
res = '<'
while len(a) > 1:
    a.rotate(-k)
    res += (str(a.pop()) + ', ')
print(res + str(a[0]) + '>')