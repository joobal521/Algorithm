class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char nowChar=my_string.charAt(i);
            if(Character.toLowerCase(nowChar)==alp.charAt(0)){
                answer+=Character.toUpperCase(nowChar);
                
            }else{
                answer+=nowChar;
            }
        }
        
        return answer;
    }
}