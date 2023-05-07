def solution(n):
    answer = 0
    a = list(map(int, str(n)))
    for i in a:
        answer += i
    return answer