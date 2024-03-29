class stack:
    def __init__(self):
        self.st = []
        
    def push(self, x):
        self.st.append(x)
    
    def pop(self):
        if len(self.st) == 0:
            return -1
        else:
            return(self.st.pop())
    
    def size(self):
        return len(self.st)
    
    def top(self):
        if len(self.st) == 0:
            return -1
        else:
            return self.st[-1]

n = int(input())
lst = list(map(int, input().split()))

a = stack()
go = 1
res = []
i = 0
while i < n:
    if lst[i] == go:
        res.append(go)
        go += 1
        i += 1
    elif a.top() == go:
         a.pop()
         res.append(go)
         go += 1
    else:
        a.push(lst[i])
        i += 1

if a.size != 0:
    for _ in range(a.size()):
        if a.pop() == go:
            res.append(go)
            go += 1

if len(res) == n:
    print("Nice")
else:
    print("Sad")