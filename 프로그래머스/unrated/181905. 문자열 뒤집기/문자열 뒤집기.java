class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
         // 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();

        // s부터 e까지의 부분을 뒤집기
        for (int i = s, j = e; i < j; i++, j--) {
            // 두 인덱스의 값을 서로 교환
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        
        for(int i=0; i<charArray.length; i++){
            answer+=charArray[i];
        }
        return answer;
    }
}