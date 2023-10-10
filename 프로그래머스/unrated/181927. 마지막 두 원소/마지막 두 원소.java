class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        answer=new int[num_list.length+1];
        
        
        //마지막 원소의 인덱스
        int last=num_list.length-1;
        
        //마지막 원소가 그 전 원소보다 큰 경우
        if(num_list[last]>num_list[last-1]){
            answer[last+1]=num_list[last]-num_list[last-1];
        
        //마지막 원소가 그 전 원소보다 작은 경우   
        }else{
            answer[last+1]=num_list[last]*2;
        }
        
        for(int i=0; i<num_list.length; i++){
            answer[i]=num_list[i];
        }
        
        return answer;
    }
}