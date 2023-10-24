class Solution {
    public int solution(int n, int t) {
         int answer = 0;
        
        answer = n * (int) Math.pow(2, t); // 2^t를 계산하여 n에 곱
        
        return answer;
    }
}