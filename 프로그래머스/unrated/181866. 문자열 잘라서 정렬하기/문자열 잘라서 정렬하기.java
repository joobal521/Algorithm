import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
       // "x"를 기준으로 문자열 나누기
        String[] answer = myString.split("x");

        // 빈 문자열 제거하고 사전순으로 정렬
        answer = Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);

       
        
        return answer;
    }
}