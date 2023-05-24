def solution(balls, share):
    n = 1
    m = 1
    o = 1
    for i in range(2, balls + 1):
        n *= i 
    for j in range(2, share + 1):
        m *= j
    for k in range(2, balls - share + 1):
        o *= k
    return n / (o * m)