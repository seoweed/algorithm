def solution(num_list):
    answer = -1
    for i in num_list:
        if i < 0:
            answer = num_list.index(i)
            break
    return answer