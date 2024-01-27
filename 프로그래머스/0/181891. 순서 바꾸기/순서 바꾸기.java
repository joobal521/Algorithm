import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        // n 번째 이후의 원소들 복사
        int[] afterN = Arrays.copyOfRange(num_list, n, num_list.length);
        
        // n 번째까지의 원소들 복사
        int[] beforeN = Arrays.copyOfRange(num_list, 0, n);
        
        // 복사한 배열을 합치기
        System.arraycopy(afterN, 0, answer, 0, afterN.length);
        System.arraycopy(beforeN, 0, answer, afterN.length, beforeN.length);
        
        return answer;
    }
}
