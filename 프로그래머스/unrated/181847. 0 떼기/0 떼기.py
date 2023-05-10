def solution(n_str):
    answer = ''
    a = 0
    if n_str[0] == "0":
        for i in range(len(n_str)):
            if n_str[i] == "0":
                a += 1
            else:
                break
        return n_str[a:]
    else:
        return n_str