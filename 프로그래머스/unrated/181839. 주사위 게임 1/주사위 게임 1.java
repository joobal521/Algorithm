class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        // a와 b를 오름차순으로 정렬
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (min % 2 == 1 && max % 2 == 1) {
            answer = min * min + max * max;
        } else if (min % 2 == 1 || max % 2 == 1) {
            answer = 2 * (min + max);
        } else {
            answer = max - min;
        }

        
        
        return answer;
    }
}