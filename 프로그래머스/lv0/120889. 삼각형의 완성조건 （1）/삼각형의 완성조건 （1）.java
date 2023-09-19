class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longLine=sides[0];
        int sum=0;        
        for(int i=1; i<sides.length; i++){
            if(sides[i]>longLine){
                sum+=longLine;
                longLine=sides[i];
            }else{
                sum+=sides[i];
            }
            
        }
        
        
        if(longLine<sum){
            answer=1;
        }else{
            answer=2;
        }
        
        
        return answer;
    }
}