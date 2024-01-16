class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; // 알파벳 대소문자 각각 26개씩 총 52개

        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                // 대문자인 경우
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                // 소문자인 경우
                answer[ch - 'a' + 26]++;
            }
        }

        return answer;
    }
}
