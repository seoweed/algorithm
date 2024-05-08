import math
t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    res = math.factorial(b) // (math.factorial(b - a) * math.factorial(a))
    print(res)