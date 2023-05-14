def solution(my_string, s, e):
    c = my_string[s:e + 1]
    return my_string[:s] + c[::-1] + my_string[e + 1:]