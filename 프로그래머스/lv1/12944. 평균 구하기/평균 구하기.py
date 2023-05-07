def solution(arr):
    answer = 0
    total = 0
    for i in arr:
        total += i
    answer = total / len(arr)
    return answer