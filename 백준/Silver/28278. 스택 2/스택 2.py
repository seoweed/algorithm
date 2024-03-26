import sys

class stack:
    def __init__(self):
        self.st = []
        
    def push(self, x):
        self.st.append(x)
    
    def pop(self):
        if len(self.st) == 0:
            print(-1)
        else:
            print(self.st.pop())
    
    def size(self):
        print(len(self.st))
    
    def isEmpty(self):
        if len(self.st) == 0:
            print(1)
        else:
            print(0)
    
    def top(self):
        if len(self.st) == 0:
            print(-1)
        else:
            print(self.st[-1])
        
input = sys.stdin.readline
a = stack()
n = int(input())
for i in range(n):
    str = input().strip()
    if str == '2':
        a.pop()
    elif str == '3':
        a.size()
    elif str == '4':
        a.isEmpty()
    elif str == '5':
        a.top()
    else:
        x, y = str.split()
        a.push(int(y))

