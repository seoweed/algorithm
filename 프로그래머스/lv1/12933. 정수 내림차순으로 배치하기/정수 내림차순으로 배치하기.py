def solution(n):
    answer = 0
    c = ""
    a = []
    a = list(map(int, str(n)))
    a.sort(reverse = True)
    for i in a:
        c += str(i)
    return int(c)