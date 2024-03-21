n, m = map(int, input().split())
a_st = set(map(int, input().split()))
b_st = set(map(int, input().split()))
print(len(a_st - b_st) + len(b_st - a_st))