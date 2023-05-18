def solution(s):
    answer = ''
    s = s.split(" ")
    max = int(s[0])
    min = int(s[0])
    for i in range(len(s)):
        if int(s[i]) <= min:
            min = int(s[i])
        elif int(s[i]) > max:
            max = int(s[i])
    return str(min) +" "+ str(max)