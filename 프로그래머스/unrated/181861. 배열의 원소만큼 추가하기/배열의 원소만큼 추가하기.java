class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int totalLength=0;
        for(int i=0; i<arr.length; i++){
            totalLength+=arr[i];
        }
        
        answer=new int[totalLength];
        
        int idx=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++)
            answer[idx++]=arr[i];
        }
        
        
        return answer;
    }
}