def solution(array):
    answer = []
    max = 0
    for i in array:
        if i > max:
            max = i
    answer = [max, array.index(max)]
    
    return answer