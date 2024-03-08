def solution(number, n, m):
    # number가 n의 배수이면서 m의 배수인지 판별
    if number % n == 0 and number % m == 0:
        return 1  # 1을 반환
    else:
        return 0  # 0을 반환


