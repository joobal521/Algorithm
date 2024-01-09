import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String num="";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                num+=my_string.charAt(i);
            }
        }
        
        String [] arr=num.split("");
        answer= new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            answer[i]=Integer.parseInt(arr[i]);
        }
         
        Arrays.sort(answer);
        
        return answer;
    }
}