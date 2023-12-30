class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int prev = 0;

        for (int num : numLog) {
            int diff = num - prev;

            if (diff == 1) {
                answer.append("w");
            } else if (diff == -1) {
                answer.append("s");
            } else if (diff == 10) {
                answer.append("d");
            } else if (diff == -10) {
                answer.append("a");
            }

            prev = num;
        }

        return answer.toString();
    }
}
