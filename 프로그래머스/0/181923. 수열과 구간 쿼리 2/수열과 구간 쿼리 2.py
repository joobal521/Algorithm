def solution(arr, queries):
    answer = []

    for query in queries:
        start, end, k = query

        sub_array = arr[start:end + 1]
        sub_array.sort()

        result = -1
        for num in sub_array:
            if num > k:
                result = num
                break

        answer.append(result)

    return answer
