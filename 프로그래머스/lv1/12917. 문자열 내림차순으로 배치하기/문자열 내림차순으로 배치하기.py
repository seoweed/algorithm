def solution(s):
    up = ""
    low = ""
    for i in s:
        if i.isupper():
            up += i
        else:
            low += i
    up = sorted(up, reverse = True)
    low = sorted(low,  reverse = True)
    return "".join(low + up)