n = int(input())
lst = list(map(int, input().split()))
lst.sort()
count = 0
for i in range(n):
    k = lst[i] # 판별되는 수 
    start = 0
    end = n-1
    while start < end:
        sum = lst[start] + lst[end]
        if sum < k:
            start += 1
        elif sum > k:
            end -= 1
        else:
            if start != i and end != i:
                count += 1
                break
            elif start == i:
                start += 1
            elif end == i:
                end -= 1
print(count)