def solution(arr):
    answer = []
    j = 0
    for i in arr:
        while j < i:
            j += 1
            answer.append(i)
        j = 0
    return answer