class Solution {
    public int solution(String myString, String pat) {
        int answer=0;
        // 문자열을 StringBuilder로 변환하여 수정 가능하도록 함
        StringBuilder modifiedString = new StringBuilder(myString);

        for (int i = 0; i <= modifiedString.length() - pat.length(); i++) {
            // 현재 위치부터 pat 길이만큼의 부분 문자열을 추출
            String substring = modifiedString.substring(i, i + pat.length());

            // 추출한 부분 문자열에서 'A'를 'B'로, 'B'를 'A'로 변경
            StringBuilder modifiedSubstring = new StringBuilder(substring);
            for (int j = 0; j < modifiedSubstring.length(); j++) {
                if (modifiedSubstring.charAt(j) == 'A') {
                    modifiedSubstring.setCharAt(j, 'B');
                } else if (modifiedSubstring.charAt(j) == 'B') {
                    modifiedSubstring.setCharAt(j, 'A');
                }
            }

            // 변경된 부분 문자열이 pat과 일치하면 answer를 1로 설정하고 반복문 종료
            if (modifiedSubstring.toString().equals(pat)) {
                answer = 1;
                break;
            }
        }

        return answer;
        
    }
}