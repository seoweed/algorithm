import sys
input = sys.stdin.readline
num = int(input()) * int(input()) * int(input())
dict = {
    '0' : 0,
    '1' : 0,
    '2' : 0,
    '3' : 0,
    '4' : 0,
    '5' : 0,
    '6' : 0,
    '7' : 0,
    '8' : 0,
    '9' : 0
}
for i in str(num):
    dict[i] += 1
for i in dict.values():
    print(i)