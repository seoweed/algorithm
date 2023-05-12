def solution(phone_number):
    return "*" * len(phone_number[:-4]) + "".join(phone_number[-4:])