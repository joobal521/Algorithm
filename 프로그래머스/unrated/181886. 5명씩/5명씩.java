class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int answerLength=0;
        int namesLength=names.length;
        
        
        if(namesLength%5==0){
            answerLength=namesLength/5;
            
        }else{
            answerLength=namesLength/5+1;
        }
        
        answer=new String[answerLength];
        
        int idx=0;
        for(int i=0; i<names.length; i+=5){
            answer[idx++]=names[i];
        }
        
        return answer;
    }
}