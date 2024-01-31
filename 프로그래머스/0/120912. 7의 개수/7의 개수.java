class Solution {
    public int solution(int[] array) {
        int answer = 0;

        // 배열 순회하여 각 숫자에서 7이 등장하는 횟수 합산
        for (int num : array) {
            String numStr = Integer.toString(num);
            for (char digit : numStr.toCharArray()) {
                if (digit == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}
