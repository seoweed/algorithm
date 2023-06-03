def solution(arr):
    answer = []
    j = 0
    for i in arr:
        if i == 2:
            answer.append(j)
        j += 1
    if len(answer) == 0:
        return [-1]
    return arr[answer[0]:answer[-1]+1]
    
