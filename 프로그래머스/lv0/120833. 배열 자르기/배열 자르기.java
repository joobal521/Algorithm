class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int len=num2-num1+1;
        answer=new int[len];
        int x=0;
        
        for(int i=num1; i<num2+1; i++){
            answer[x++]=numbers[i];
        }
        
        return answer;
    }
}