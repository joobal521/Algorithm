class Solution {
    public String[] solution(String my_string) {
        String[] parts = my_string.split(" ");
        // 빈 문자열을 제외한 문자열 개수를 세기
        int count = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                count++;
            }
        }

        String[] answer = new String[count];
        int index = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                answer[index] = part;
                index++;
            }
        }
        return answer;
    }
}