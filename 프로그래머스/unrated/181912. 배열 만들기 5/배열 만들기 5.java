import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();

        for (String str : intStrs) {
            if (s < str.length() && s + l <= str.length()) {
                String subString = str.substring(s, s + l);
                int intValue = Integer.parseInt(subString);
                if (intValue > k) {
                    resultList.add(intValue);
                }
            }
        }

        // List를 배열로 변환
        int size = resultList.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
