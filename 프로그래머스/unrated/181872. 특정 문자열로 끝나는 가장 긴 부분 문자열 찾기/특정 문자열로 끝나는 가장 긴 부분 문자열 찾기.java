class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int len=myString.length();
        int patLen=pat.length();
        
        for(int i=0; i<len; i++){
            if(i+patLen<=len){
               String partWord=myString.substring(i, i+patLen);
                if(partWord.equals(pat)){
                    answer=myString.substring(0,i+patLen);
                }
            }
        }
        
        
        
        return answer;
    }
}