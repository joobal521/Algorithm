class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
         
        if ("<".equals(ineq) && "=".equals(eq)) {
            if (n <= m) {
                answer = 1;
            }
        } else if (">".equals(ineq) && "=".equals(eq)) {
            if (n >= m) {
                answer = 1;
            }
        } else if (">".equals(ineq) && "!".equals(eq)) {
            if (n > m) {
                answer = 1;
            }
        } else if ("<".equals(ineq) && "!".equals(eq)) {
            if (n < m) {
                answer = 1;
            }
        } else if ("=".equals(eq) && n == m) {
            // 추가: eq가 '='이고 두 수가 같은 경우
            answer = 1;
        }
        return answer;
    }
}