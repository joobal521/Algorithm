import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            if (i < num_list.length) {
                answerList.add(num_list[i]);
            }
        }

        // List를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}