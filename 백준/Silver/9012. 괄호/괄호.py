import sys

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
        
input = sys.stdin.readline
k = int(input())

for _ in range(k):
    a = stack()
    lst = list(input().strip())
    for i in lst:
        if i == '(':
            a.push(i)
        else:
            if a.top() == '(':
                a.pop()
            else:
                a.push(i)
                break
    if a.size() == 0:
        print("YES")
    else:
        print("NO")
