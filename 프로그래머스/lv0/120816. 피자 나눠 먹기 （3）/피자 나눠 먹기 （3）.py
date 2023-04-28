import math
def solution(slice, n):
    answer = 1
    if slice <= n:
        answer = math.ceil(n / slice)
    return answer