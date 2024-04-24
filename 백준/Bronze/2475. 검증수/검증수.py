lst = list(map(int, input().split()))
res = 0
for i in lst:
    res += i ** 2
print(res%10)