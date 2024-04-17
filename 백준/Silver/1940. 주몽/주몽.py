n = int(input())
m = int(input())
lst = list(map(int, input().split()))
lst.sort()
i = 0
j = n - 1
count = 0

while i < j:
    sum = lst[i] + lst[j] 
    if sum < m:
        i += 1
    elif sum > m:
        j -= 1
    else:
        count += 1
        i += 1
        j -= 1
print(count)