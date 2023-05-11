def solution(a, b, c):
    
    if a == b == c:
        return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c)
    elif a == b != c or a != b == c or a == c != b:
        return (a + b + c) * (a*a + b*b + c*c) 
    else:
        return (a + b + c)