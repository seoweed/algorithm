def solution(rsp):
    answer = ''
    for i in rsp:
        if int(i) == 2:
            answer += "0"
        elif int(i) == 0:
            answer += "5"
        else:
            answer += "2"
    return answer