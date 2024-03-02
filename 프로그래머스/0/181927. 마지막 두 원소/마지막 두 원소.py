def solution(num_list):
    if len(num_list) >= 2:
        last_element = num_list[-1]
        second_last_element = num_list[-2]

        if last_element > second_last_element:
            answer = num_list + [last_element - second_last_element]
        else:
            answer = num_list + [last_element * 2]
    else:
        # 리스트의 길이가 1 이하일 경우, 그대로 반환
        answer = num_list.copy()

    return answer
