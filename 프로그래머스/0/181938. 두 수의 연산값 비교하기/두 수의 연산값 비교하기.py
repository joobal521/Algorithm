def solution(a, b):
    # 두 정수를 연산하여 나온 결과
    result1 = int(str(a) + str(b))
    result2 = 2 * a * b

    # 두 결과 중 더 큰 값을 반환
    answer = max(result1, result2)
    return answer

# 테스트 예시
a = 12
b = 3
result = solution(a, b)
print(result)
