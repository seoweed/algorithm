lst = list(map(str, input().upper()))
counter = {}
res = []

for i in lst:
    if i in counter:
        counter[i] += 1
    else:
        counter[i] = 1
m = max(counter.values())
for k, v in counter.items():
    if v == m:
        res.append(k)
        
if len(res) == 1:
    print(res[0])
else:
    print('?')