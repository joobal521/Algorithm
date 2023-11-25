class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int size=0;
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x')
                size++;
        }
        
        answer=new int[size+1];
        
        int count=0;
        int idx=0;
        for(int i=0; i<myString.length(); i++){
           
                if(myString.charAt(i)=='x'){
                    answer[idx++]=count;
                    count=0;
                }else{
                    count++;
                }
                    
        }
        if(count>0){
            answer[idx++]=count;
        }
        
        
        return answer;
    }
}