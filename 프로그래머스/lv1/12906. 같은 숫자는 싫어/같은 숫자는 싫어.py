def solution(arr):
    stack = [arr[0]]
    for i in arr:
        if i != stack[-1]:
            stack.append(i)
    return stack