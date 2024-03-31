from collections import deque

class queue:
    def __init__(self, lst):
        self.qu = deque(lst)
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

n = int(input())
a = queue(range(1, n+1))
while a.size() > 1:
    a.pop()
    temp = a.pop()
    a.push(temp)
print(a.qu[0])