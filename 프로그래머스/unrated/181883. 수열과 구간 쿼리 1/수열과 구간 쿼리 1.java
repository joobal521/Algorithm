class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] answer = new int[n];

        // 각 쿼리에 대해 처리
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            // 배열의 인덱스는 0부터 시작하므로 1을 빼서 인덱스에 맞춤
            start = Math.max(0, start);         // 음수가 되지 않도록 조정
            end = Math.min(n - 1, end);         // 배열 길이를 벗어나지 않도록 조정

            // 범위 내의 인덱스에 대해 1을 더함
            answer[start] += 1;

            // 범위가 끝나는 다음 인덱스에 대해 1을 뺌
            if (end + 1 < n) {
                answer[end + 1] -= 1;
            }
        }

        // 누적된 값을 이용하여 최종 결과 배열을 생성
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }

        // 최종 결과 배열을 기존 배열에 더하여 최종 결과를 생성
        for (int i = 0; i < n; i++) {
            answer[i] += arr[i];
        }

        return answer;
    }
}
