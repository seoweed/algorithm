def solution(num, k):
    answer = 0
    for i in str(num):
        if i == str(k):
            return str(num).index(str(k)) +1
    return -1
        