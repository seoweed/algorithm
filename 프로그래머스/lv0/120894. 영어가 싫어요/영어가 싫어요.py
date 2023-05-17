def solution(numbers):
    answer = ''
    nums = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    anum = [0,1,2,3,4,5,6,7,8,9]
    j = 0
    for i in range(len(numbers)+1):
        if numbers[j:i] in nums:
            answer += str(anum[nums.index(numbers[j:i])])
            j = i
            
    return int(answer)