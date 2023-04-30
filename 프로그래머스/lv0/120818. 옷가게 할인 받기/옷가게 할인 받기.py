def solution(price):
    answer = 0
    if price >= 500000:
        answer = int(price * (4/5))
    elif price >= 300000:
        answer = int(price * (9/10))
    elif price >= 100000:
        answer = int(price * (95/100))
    else:
        answer = price  
    return answer