h, m = map(int, input().split())
t = int(input())

h = h + (t // 60)
m = m + (t % 60)

if m >= 60 :
    h = h + (m // 60)
    m = m % 60
    if h >= 24:
       h = h - 24
else:
    if h >= 24:
       h = h - 24
print(h, m)