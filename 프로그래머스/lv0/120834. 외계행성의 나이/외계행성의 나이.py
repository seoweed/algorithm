def solution(age):
    answer = ''
    new_age = ["a", "b", "c", "d","e","f", "g", "h", "i","j"]
    num_list = list(map(int, str(age)))
    for i in num_list:
        answer += new_age[i]
    
    return answer