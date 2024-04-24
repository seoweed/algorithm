def backtracking():
    if len(res) == m:
        print(" ".join(map(str, res)))
        return 
    for i in range(1, n+1):
        if len(res) == 0:
            res.append(i)
            backtracking()
            res.pop()
        elif i not in res and i > res[-1]:
            res.append(i)
            backtracking()
            res.pop()
n, m = map(int, input().split())
res = []
backtracking()