import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];

            int[] subArray = Arrays.copyOfRange(arr, start, end + 1);
            Arrays.sort(subArray);

            int result = -1;
            for (int num : subArray) {
                if (num > k) {
                    result = num;
                    break;
                }
            }

            answer[i] = result;
        }

        return answer;
    }
}
