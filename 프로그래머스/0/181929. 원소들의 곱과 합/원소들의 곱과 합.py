def solution(num_list):
    multiply = 1
    sum_value = 0
    
    for num in num_list:
        multiply *= num
        sum_value += num
    
    if multiply < sum_value ** 2:
        return 1
    else:
        return 0
