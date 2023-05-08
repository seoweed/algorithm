import math
def solution(n):
    answer = 0
    answer = math.sqrt(n)
    if answer.is_integer() == True:
        return (answer + 1) * (answer + 1)
    else:
        return -1