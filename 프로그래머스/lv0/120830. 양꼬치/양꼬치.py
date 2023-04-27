def solution(n, k):
    answer = 0
    service_drink = n // 10
    k -= service_drink 
    answer = n * 12000 + k * 2000
    return answer