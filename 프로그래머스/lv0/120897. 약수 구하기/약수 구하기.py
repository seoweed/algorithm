def solution(n):
    answer = []
    i = 0
    while i < n:
        i += 1
        if n % i == 0:
            answer.append(i)
    return answer