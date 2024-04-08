def Fibonacci(num):
    if num == 0:
        return 0
    elif num == 1:
        return 1
    return Fibonacci(num-2) + Fibonacci(num-1)

n = int(input())
print(Fibonacci(n))