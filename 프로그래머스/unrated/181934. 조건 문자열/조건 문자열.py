def solution(ineq, eq, n, m):
    boo = True
    if eq == "=":
        if ineq == "<":
            boo = n <= m
        else:
            boo = n >= m
    else:
        if ineq == "<":
            boo = n < m
        else:
            boo = n > m
    if boo == True:
        return 1
    else:
        return 0;