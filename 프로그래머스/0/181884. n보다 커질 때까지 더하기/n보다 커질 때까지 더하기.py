def solution(numbers, n):
    current_sum = 0
    for num in numbers:
        current_sum += num
        if current_sum > n:
            break
    return current_sum
