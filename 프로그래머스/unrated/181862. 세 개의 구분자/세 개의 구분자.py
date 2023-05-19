def solution(myStr):
    answer = []
    a = myStr.replace('b', 'a').replace('c', 'a').split('a')
    for i in a:
        if i != "":
            answer.append(i)
    if answer:
        return answer
    return ["EMPTY"]
            
            
    