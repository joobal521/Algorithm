class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        //문자열 배열로
        char[]arr=num_str.toCharArray();
        
        //배열을 int배열로
        int[]num=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            num[i]=arr[i]-'0';
        }
        
        for(int i=0; i<num.length; i++){
            answer+=num[i];
        }
        return answer;
    }
}