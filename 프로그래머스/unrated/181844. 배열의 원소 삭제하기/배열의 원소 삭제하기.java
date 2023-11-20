class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int count=0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    count++;
                    break; //값을 찾았으면 다음 원소로
                }
            }
        }
        
        answer=new int[arr.length-count];
        
        int idx=0;
        for(int i=0; i<arr.length; i++){
            boolean isDelete=false;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    isDelete=true;
                    break;
                }
            }
             if(!isDelete){
            answer[idx++]=arr[i];
        }
            
        }
        
       
        
        return answer;
    }
}