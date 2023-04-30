def solution(n):
    answer = 0
    a = []
    for i in str(n):
        a.append(i)
    for j in a:
        answer += int(j)    
    return answer