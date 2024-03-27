def solution(l, r):
    result = []
    
    for num in range(l, r+1):
        if is_only_zero_and_five(num):
            result.append(num)
    
    if not result:
        return [-1]
    
    return result

def is_only_zero_and_five(num):
    while num > 0:
        digit = num % 10
        if digit != 0 and digit != 5:
            return False
        num //= 10
    return True
