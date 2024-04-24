import sys
input = sys.stdin.readline
def A():
    global cnt
    for i in range(1, w+1):
        for j in range(1, h+1):
            cnt += 1
            if cnt == n:
                return j * 100 + i
t = int(input())
for _ in range(t):
    h, w, n = map(int, input().split())
    cnt = 0
    print(A())