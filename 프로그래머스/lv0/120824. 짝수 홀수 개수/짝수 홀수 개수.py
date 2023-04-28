def solution(num_list):
    answer = []
    a = 0
    b = 0
    for i in num_list:
        if i % 2 == 0:
            a += 1
        else: 
            b += 1
    answer.append(a)
    answer.append(b)
    
    return answer