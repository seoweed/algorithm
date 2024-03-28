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
while 1:
    a = stack()
    lst = input().rstrip()
    if lst[0] == '.':
        break
    for i in lst:
        if i in ['(', '[']:
            a.push(i)
        elif i == ')':
            if a.top() == '(':
                a.pop()
            else:
                a.push(i)
                break
        elif i == ']':
            if a.top() == '[':
                a.pop()
            else:
                a.push(i)
                break
    if a.size() == 0:
        print("yes")
    else:
        print("no")
