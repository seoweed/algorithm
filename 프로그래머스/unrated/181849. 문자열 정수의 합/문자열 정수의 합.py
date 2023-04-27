def solution(num_str):
    answer = 0
    for i in list(num_str):
        answer += int(i)
    return answer