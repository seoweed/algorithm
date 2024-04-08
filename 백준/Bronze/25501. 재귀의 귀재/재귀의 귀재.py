import sys

def recursion(s, l, r, cnt):
    if l >= r: 
        return 1
    elif s[l] != s[r]:
        return 0, cnt
    else:
        cnt += 1
        return recursion(s, l+1, r-1, cnt)
    
def isPalindrome(s):
    return recursion(s, 0, len(s)-1, 0)

n = int(input())
lst = []
for _ in range(n):
    lst.append(sys.stdin.readline().rstrip())
for i in lst:
    a = isPalindrome(i)
    if a == 1:
        print(a, (len(i) // 2) + 1)
    else:
        print(a[0], a[1] + 1)