import sys
while 1:
    a, b = map(int, sys.stdin.readline().split())
    if a + b == 0:
        break
    elif a > b:
        if a % b == 0:
            print('multiple')
        else:
            print('neither')
    else:
        if b % a == 0:
            print('factor')
        else:
            print('neither')   