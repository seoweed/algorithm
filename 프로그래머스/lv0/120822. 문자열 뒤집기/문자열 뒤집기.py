def solution(my_string):
    answer = ''
    
    a = list(my_string)
    b = a[::-1]
    for i in b:
        answer += i 
    return answer