class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1;

        // 팩토리얼 값이 n을 초과하지 않는 가장 큰 i를 찾음
        while (factorial <= n) {
            i++;
            factorial *= i;
        }

        // i는 주어진 n을 초과하지 않는 가장 큰 정수
        return i - 1;
    }
}
