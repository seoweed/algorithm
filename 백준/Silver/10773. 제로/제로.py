import sys

class stack:
    def __init__(self):
        self.st = []
        
    def push(self, x):
        self.st.append(x)
    
    def pop(self):
        return(self.st.pop())
        
input = sys.stdin.readline
a = stack()
k = int(input())
res = 0
for _ in range(k):
    n = int(input())
    if n == 0:
        temp = a.pop()
        res -= temp
    else:
        a.push(n)
        res += n
print(res)

