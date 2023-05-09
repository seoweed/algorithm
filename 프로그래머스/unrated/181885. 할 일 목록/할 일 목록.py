def solution(todo_list, finished):
    answer = []
    a = []
    for i in range(len(finished)):
        if finished[i] == False:
            a.append(i)
    for i in a:
        answer.append(todo_list[i])
    return answer