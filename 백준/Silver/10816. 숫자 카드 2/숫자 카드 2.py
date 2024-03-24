n = int(input())
n_lst = map(int, input().split())
m = int(input())
t_lst = map(int, input().split())

dic = {}
for i in n_lst:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1
for i in t_lst:
    try:
        print(dic[i], end=' ')
    except KeyError:
        print(0, end=' ')