def solution(my_string):
    answer = ''
    a = sorted(my_string.lower())
    for i in a:
        answer += i
    return answer