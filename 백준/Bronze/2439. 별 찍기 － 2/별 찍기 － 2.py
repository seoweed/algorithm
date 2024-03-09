a = int(input())

for i in range(1, a+1):
    result = (' ' * (a-i)) + ('*' * i)
    print(result)