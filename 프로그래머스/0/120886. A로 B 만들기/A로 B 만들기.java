import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
       // 문자열을 문자 배열로 변환
        char[] bfArr = before.toCharArray();
        char[] afArr = after.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(bfArr);
        Arrays.sort(afArr);

        // 정렬된 문자 배열이 원래 순서로 같은지 비교
        if (Arrays.equals(bfArr, afArr)) {
            answer = 1;
        }
        return answer;
    }
}