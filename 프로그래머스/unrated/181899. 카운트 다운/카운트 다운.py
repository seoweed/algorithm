def solution(start, end):
    answer = [start]
    while start > end:
        start -= 1
        answer.append(start)
    return answer