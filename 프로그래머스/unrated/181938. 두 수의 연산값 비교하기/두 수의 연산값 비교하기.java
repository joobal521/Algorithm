class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aa= Integer.toString(a);
        String bb=Integer.toString(b);
        
        String ab=aa+bb;
        int num=Integer.valueOf(ab);
        
        int num2=2*a*b;
        
        
        
        if(num==num2){
            answer=num;
        }else if(num>num2){
            answer=num;
        }else if(num<num2){
            answer=num2;
        }
        
        return answer;
    }
}