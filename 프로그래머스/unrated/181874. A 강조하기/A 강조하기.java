class Solution {
    public String solution(String myString) {
        String answer = "";
         for (int i = 0; i < myString.length(); i++) {
            char alph = myString.charAt(i);

            if (alph == 'a' || alph == 'A') {
                answer += "A";
            } else {
                answer += Character.toString(alph).toLowerCase();
            }
        }
        
        return answer;
    }
}