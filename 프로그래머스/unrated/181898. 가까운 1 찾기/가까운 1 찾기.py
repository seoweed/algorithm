def solution(arr, idx):
    arr = arr[idx:]
    for i in arr:
        if i == 1:
            return arr.index(1) + idx       
    return -1