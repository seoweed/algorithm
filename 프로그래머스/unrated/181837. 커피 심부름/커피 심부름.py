def solution(order):
    a = ["iceamericano", "americanoice", "americanohot", "hotamericano", "americano", "anything"]
    ame = 0
    lat = 0
    for i in order:
        if i in a:
            ame += 1
        else:
            lat += 1
    return (ame * 4500) + (lat * 5000)
