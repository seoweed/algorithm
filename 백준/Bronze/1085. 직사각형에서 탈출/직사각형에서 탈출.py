x, y, w, h = map(int, input().split())
lst = []
lst.append(x - 0)
lst.append(y - 0)
lst.append(w - x)
lst.append(h - y)

print(min(lst))