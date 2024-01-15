import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> resultList = new ArrayList<>();
        StringBuilder currentSegment = new StringBuilder();

        for (char ch : myStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                // 구분자인 경우, 현재 segment를 결과 리스트에 추가하고 초기화
                if (currentSegment.length() > 0) {
                    resultList.add(currentSegment.toString());
                    currentSegment = new StringBuilder();
                }
            } else {
                // 구분자가 아닌 경우, 현재 segment에 추가
                currentSegment.append(ch);
            }
        }

        // 남아있는 segment가 있을 경우 추가
        if (currentSegment.length() > 0) {
            resultList.add(currentSegment.toString());
        }

        // 결과 배열 생성
        String[] answer;
        if (resultList.isEmpty()) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = resultList.toArray(new String[0]);
        }

        return answer;
    }
}
