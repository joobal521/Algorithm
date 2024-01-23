import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        // LinkedHashSet을 사용하여 중복 제거와 순서 유지
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // 문자열을 순회하면서 중복된 문자를 제거
        for (char c : my_string.toCharArray()) {
            uniqueChars.add(c);
        }

        // 중복이 제거된 문자열 생성
        StringBuilder result = new StringBuilder();
        for (Character uniqueChar : uniqueChars) {
            result.append(uniqueChar);
        }

        return result.toString();
    }
}
