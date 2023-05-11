def solution(myString):
    answer = ''
    trans = ['a', 'b', 'c','d', 'e', 'f','g', 'h', 'i','j', 'k']
    for i in myString:
        if i not in trans:
            answer += i
        else:
            answer += 'l'
    return answer