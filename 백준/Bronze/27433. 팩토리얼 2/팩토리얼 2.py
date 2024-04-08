def factorial(num):
    if num == 0:
        return 1
    elif num == 1:
        return 1
    return factorial(num-1) * num

n = int(input())
print(factorial(n))