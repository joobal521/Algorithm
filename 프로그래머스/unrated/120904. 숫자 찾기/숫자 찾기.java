class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String numStr=Integer.toString(num);
        int arr[]=new int[numStr.length()];
        
        
        for(int i=0; i<numStr.length(); i++){
            arr[i]=numStr.charAt(i)-'0';
          
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                answer=i+1;
                break;
            }
        }
        
        
        
        return answer;
    }
}