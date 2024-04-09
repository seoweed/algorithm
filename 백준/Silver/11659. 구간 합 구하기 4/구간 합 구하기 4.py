import sys
input = sys.stdin.readline

n, m = map(int, input().split())
lst = list(map(int, input().split()))
sum_lst = [lst[0]]
for i in range(1, len(lst)):
    sum_lst.append(sum_lst[i-1] + lst[i])

for _ in range(m):
    i, j = map(int, input().split())
    if i == 1:
        print(sum_lst[j-1])
    else:

        print(sum_lst[j-1] - sum_lst[i-2])
    
