def solution(seoul):
    x = 0;
    for i in seoul:
        if i == "Kim":
            x = seoul.index("Kim")
            return "김서방은 {}에 있다".format(x)
    return answer