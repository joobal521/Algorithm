class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa=String.valueOf(a);
        String bb=String.valueOf(b);
        
        String answer1=aa+bb;
        String answer2=bb+aa;
        
        int result1=Integer.parseInt(answer1);
        int result2=Integer.parseInt(answer2);
        
        if(result1>=result2){
            answer=result1;
        }else{
            answer=result2;
        }
        
        return answer;
    }
}