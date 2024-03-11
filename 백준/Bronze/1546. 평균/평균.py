n = int(input())
lst = list(map(int, input().split()))
s = 0;

m = max(lst)
for i in lst:
    s = s + (i/m*100)
print(s/n)