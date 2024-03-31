from collections import deque
import sys

class queue:
    def __init__(self):
        self.qu = deque()
    def push(self, x):
        self.qu.append(x)
    def pop(self):
        if len(self.qu) == 0:
            return -1
        return self.qu.popleft()
    def size(self):
        return len(self.qu)
    def empty(self):
        if len(self.qu) == 0:
            return 1
        else:
            return 0
    def front(self):
        if len(self.qu) == 0:
            return -1
        else:
            return self.qu[0]
    def back(self):
        if len(self.qu) == 0:
            return -1
        else:
            return self.qu[-1]
    

input = sys.stdin.readline
a = queue()
n = int(input())
for _ in range(n):
    s = input().strip()
    if s == 'pop':
        print(a.pop())
    elif s == 'size':
        print(a.size())
    elif s == 'empty':
        print(a.empty())
    elif s == 'front':
        print(a.front())
    elif s == 'back':
        print(a.back())
    else:
        k, v = s.split()
        a.push(v)