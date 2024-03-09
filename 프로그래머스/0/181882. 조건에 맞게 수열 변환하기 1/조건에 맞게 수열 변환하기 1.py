def solution(arr):
    answer = []

    for num in arr:
        if num >= 50 and num % 2 == 0:
            # 값이 50보다 크거나 같은 짝수인 경우
            answer.append(num // 2)
        elif num < 50 and num % 2 == 1:
            # 값이 50보다 작은 홀수인 경우
            answer.append(num * 2)
        else:
            # 나머지 경우는 그대로 추가
            answer.append(num)

    return answer


