def solution(str_list):
    a = 0
    for i in str_list:
        if i == 'l':
            return str_list[:a]
        elif i == 'r':
            return str_list[a + 1:]
        a += 1
    return []