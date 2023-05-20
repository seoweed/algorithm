def solution(array, n):
    a = []
    array.sort()
    for i in array:
        a.append(abs(i - n))
    return array[a.index(min(a))]