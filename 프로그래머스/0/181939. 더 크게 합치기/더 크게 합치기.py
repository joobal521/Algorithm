def solution(a, b):
    ab_concat = int(str(a) + str(b))
    ba_concat = int(str(b) + str(a))
    
    if ab_concat > ba_concat:
        return ab_concat
    else:
        return ba_concat

# 예시 사용
result = solution(12, 3)
print(result)  # 출력: 123
