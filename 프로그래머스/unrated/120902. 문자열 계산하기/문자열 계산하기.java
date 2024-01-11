class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] tokens = my_string.split(" "); // 공백을 기준으로 수식을 토큰으로 분리

        // 첫 번째 숫자를 초기값으로 설정
        int result = Integer.parseInt(tokens[0]);

        // 연산자와 숫자를 번갈아 가면서 계산
        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            int operand = Integer.parseInt(tokens[i + 1]);

            // 연산자에 따라 계산 수행
            if (operator == '+') {
                result += operand;
            } else if (operator == '-') {
                result -= operand;
            }
        }

        answer = result;
        return answer;
    }
}
