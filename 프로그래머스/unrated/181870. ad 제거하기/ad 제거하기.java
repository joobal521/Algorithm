class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        int size=0;
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                size++;
            }
        }
        answer=new String[size];
        
         int idx=0;
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                 answer[idx++]=strArr[i];
            }
        }
        
        
        return answer;
    }
}