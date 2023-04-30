def solution(num_list):
    answer = 0
    a = 1
    for i in num_list:
        if len(num_list) >= 11:
            answer += i
        else:
            a *= i
            answer = a    
    return answer