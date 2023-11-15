class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer=new String[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            if(i%2==1){
                strArr[i]=strArr[i].toUpperCase();
            }else{
                strArr[i]=strArr[i].toLowerCase();
            }
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i]=strArr[i];
        }
        
        
        
        
        
        
        return answer;
    }
}