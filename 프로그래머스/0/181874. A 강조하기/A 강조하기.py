def solution(my_string):
    answer = ""
    for char in my_string:
        if char == 'a' or char == 'A':
            answer += 'A'
        else:
            answer += char.lower()
    return answer
