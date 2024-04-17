n = int(input())
pointer1 = 1
pointer2 = 1
count = 1
sum = 1

while pointer2 != n:
    if sum == n:
        count += 1
        pointer2 += 1
        sum += pointer2
    elif sum > n:
        sum -= pointer1
        pointer1 += 1
    else:
        pointer2 += 1
        sum += pointer2

print(count)