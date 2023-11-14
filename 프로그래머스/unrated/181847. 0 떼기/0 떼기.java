class Solution {
    public String solution(String n_str) {
        String answer = "";
        
         boolean leadingZero = true;

        for (int i = 0; i < n_str.length(); i++) {
            char currentChar = n_str.charAt(i);

            if (leadingZero && currentChar == '0') {
                // 현재 문자가 0이면 계속해서 0을 스킵
                continue;
            }

            // 0이 아닌 문자가 나타날 때부터 leadingZero를 false로 설정
            leadingZero = false;

            // 현재 문자를 결과 문자열에 추가
            answer += currentChar;
        }

        
        return answer;
    }
}