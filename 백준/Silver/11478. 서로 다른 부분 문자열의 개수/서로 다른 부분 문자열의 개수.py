s = input()
n = len(s)
res = set()

for i in s:
    res.add(i)
for j in range(1, n):
  for i in range(n-j):
      start = i
      end = i + j
      res.add(s[start:end+1])

print(len(res))