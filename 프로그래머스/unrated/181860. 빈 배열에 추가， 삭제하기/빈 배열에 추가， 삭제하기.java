class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                int newSize=answer.length+arr[i]*2;
                int[]temp=new int[newSize];
            
                for(int j=0; j<answer.length; j++){
                    temp[j]=answer[j];
                }
                
                for(int j=answer.length; j<temp.length; j++){
                temp[j]=arr[i];    
                }
                
                answer=temp;
            }else{
                int newSize=answer.length-arr[i];
                
                if(newSize>=0){
                    int[]temp=new int[newSize];
                for(int j=0; j<newSize; j++){
                    temp[j]=answer[j];
                }
                   answer=temp; 
                }else{
                    answer=new int[0];
                }
                
              
            }
        }
        return answer;
    }
}