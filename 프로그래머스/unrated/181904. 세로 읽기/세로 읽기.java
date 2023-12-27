class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i += m) {
            int endIndex = Math.min(i + m, my_string.length());
            String substring = my_string.substring(i, endIndex);

            // c번째 열의 문자를 answer에 추가
            if (c - 1 < substring.length()) {
                answer+=(substring.charAt(c - 1));
            }
        }
        
        
        return answer;
    }
}