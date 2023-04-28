def solution(numbers):
    answer = 1
    a = sorted(numbers)
    b = a[len(a) - 2:]
    for i in b:
        answer = answer * i
    return answer
    