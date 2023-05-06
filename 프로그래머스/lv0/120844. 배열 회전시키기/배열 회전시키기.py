def solution(numbers, direction):
    answer = []
    if direction == "left":
        for i in range(len(numbers) - 1):
            answer.append(numbers[i + 1])
        answer.append(numbers[0])
    else:
        answer.append(numbers[len(numbers)-1])
        for i in range(len(numbers) - 1):
            answer.append(numbers[i])
        
               
    return answer