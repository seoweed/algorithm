def solution(numbers):
    answer = 0
    i = 0
    total = 0
    
    for i in numbers:
        total += i
    
    answer = total/len(numbers)
    return answer