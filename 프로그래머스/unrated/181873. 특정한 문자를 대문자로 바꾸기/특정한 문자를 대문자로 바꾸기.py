def solution(my_string, alp):
    answer = ''
    for i in my_string:
        if alp in my_string:
            return my_string.replace(alp, alp.upper())
        else:
            return my_string
    