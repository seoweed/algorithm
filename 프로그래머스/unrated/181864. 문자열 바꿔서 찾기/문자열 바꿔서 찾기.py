def solution(myString, pat):
    answer = 0
    a = myString.replace("A", "C")
    b = a.replace("B", "A")
    c = b.replace("C", "B")
    if pat in c:
        answer = 1
    return answer