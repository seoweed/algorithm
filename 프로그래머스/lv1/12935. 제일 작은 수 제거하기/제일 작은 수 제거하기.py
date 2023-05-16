def solution(arr):
    answer = []
    min = arr[0]
    if len(arr) == 1:
        return [-1]
    else:
        for i in arr:
            if i < min:
                min = i
        a = arr.index(min)
        arr.pop(a)
        return arr
    