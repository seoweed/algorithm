def solution(my_string):
    answer = []
    for i in my_string:
        if i >= '0' and i <='9':
            answer.append(int(i))
    answer.sort()
    return answer