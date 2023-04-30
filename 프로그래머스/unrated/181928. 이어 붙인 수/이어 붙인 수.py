def solution(num_list):
    answer = 0
    a = ''
    b = ''
    for i in num_list:
        if i % 2 == 1:
            a += str(i)
        else:
            b += str(i)
    answer = int(a) + int(b)
    return answer