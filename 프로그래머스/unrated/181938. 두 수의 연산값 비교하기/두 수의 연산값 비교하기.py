def solution(a, b):
    c = int(str(a) + str(b))
    if c >= a * b * 2:
        return c
    else:
        return a * b * 2