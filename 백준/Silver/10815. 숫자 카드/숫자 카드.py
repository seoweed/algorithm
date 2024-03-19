import sys
input = sys.stdin.readline

def binary_search(target, data):
    start = 0 
    end = len(data) - 1 

    while start <= end:
        mid = (start + end) // 2

        if data[mid] == target:
            return print(1, end=' ') 

        elif data[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return print(0, end=' ')

n = input()
n_card = list(map(int, input().split()))
m = input()
t_card = list(map(int, input().split()))

n_card.sort()
for i in t_card:
    binary_search(i, n_card)

