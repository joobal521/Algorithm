def solution(num_list, n):
    if n <= len(num_list):
        return num_list[n-1:]
    else:
        return []

# 테스트 예시
num_list = [2, 1, 6]
n = 3
result = solution(num_list, n)
print(result)
