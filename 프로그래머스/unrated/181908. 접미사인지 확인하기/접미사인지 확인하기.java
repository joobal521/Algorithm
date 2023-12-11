class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int myStringLength = my_string.length();
        int suffixLength = is_suffix.length();

        // 주어진 문자열이 접미사인지 확인
        if (myStringLength >= suffixLength && my_string.endsWith(is_suffix)) {
            answer = 1;
        }
        return answer;
    }
}