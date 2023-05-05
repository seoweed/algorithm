def solution(my_string, is_prefix):
    answer = 0
    a = len(is_prefix)
    if my_string[:a] == is_prefix[:a]:
        answer = 1
        
    return answer