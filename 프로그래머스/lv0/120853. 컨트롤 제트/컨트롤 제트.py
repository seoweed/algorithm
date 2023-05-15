def solution(s):
    answer = 0
    k = -1
    a = s.split(' ')
    for i in a:
        k += 1
        if i == 'Z':
            answer -= int(a[k - 1])         
        else:
            answer += int(i)
    return answer