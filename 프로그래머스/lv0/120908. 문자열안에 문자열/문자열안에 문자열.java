class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        //contains메소드: 주어진 문자열이 단순히 포함되어 있는지 조사
               if(str1.contains(str2)){
                answer=1;   
               }else{
                   answer=2;
               }
           
        
        return answer;
    }
}