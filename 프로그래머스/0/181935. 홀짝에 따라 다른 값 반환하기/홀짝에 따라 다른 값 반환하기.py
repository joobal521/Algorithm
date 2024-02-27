def solution(n):
    if n % 2 == 1:  # 홀수인 경우
        answer = sum(range(1, n + 1, 2))
    else:  # 짝수인 경우
        answer = sum(x**2 for x in range(2, n + 1, 2))
    return answer
