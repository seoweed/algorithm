def solution(s):
    answer = True
    
    s = s.lower()
    p_repo = 0
    y_repo = 0
    for i in s:
        if i == 'p':
            p_repo += 1
        elif i == 'y':
            y_repo += 1
    if p_repo == y_repo:
        return answer
    return False