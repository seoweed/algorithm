def solution(n):
    total = 0
    while (n >= 2):
        if (n % 2 == 0):
            total += n
        n = n - 1
    answer = total
    
    return answer