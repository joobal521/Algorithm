class Solution {
    public int solution(String binomial) {
        String[] tokens = binomial.split(" ");
        int operand1 = Integer.parseInt(tokens[0]);
        char operator = tokens[1].charAt(0);
        int operand2 = Integer.parseInt(tokens[2]);

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            default:
                // 예외 처리: 유효하지 않은 연산자인 경우
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}