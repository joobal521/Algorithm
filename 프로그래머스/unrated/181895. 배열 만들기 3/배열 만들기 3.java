class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];

        int length1 = end1 - start1 + 1;
        int length2 = end2 - start2 + 1;

        answer = new int[length1 + length2];

        // 첫 번째 구간에 해당하는 배열 복사
        for (int i = start1; i <= end1; i++) {
            answer[i - start1] = arr[i];
        }

        // 두 번째 구간에 해당하는 배열 복사
        for (int i = start2; i <= end2; i++) {
            answer[i - start2 + length1] = arr[i];
        }

        return answer;
    }
}