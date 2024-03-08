a, b, c = map(int, input().split())
sam = 0

if a == b:
    sam = sam + 1;
    eq = a
if a == c:
    sam = sam + 1;
    eq = a
if b == c:
    sam = sam + 1;
    eq = b

if sam == 3 :
    result = 10000 + eq * 1000
elif sam == 1:
    result = 1000 + eq * 100
else:
    m = max(a, b, c)
    result = m * 100

print(result)