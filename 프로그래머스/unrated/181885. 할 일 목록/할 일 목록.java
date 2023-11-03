class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        
        int count=0;
        int index=0;
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false){
                count++;
            }
        }
        
        answer=new String[count];
        
        
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                answer[index++]=todo_list[i];
            }
        }
        
        return answer;
    }
}