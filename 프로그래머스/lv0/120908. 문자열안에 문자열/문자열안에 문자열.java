class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int len1 = str1.length();
        int len2 = str2.length();
        boolean isMatch = false;

        for (int i = 0; i <= len1 - len2; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                isMatch = true;
                for (int j = 1; j < len2; j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    return 1;
                }
            }
        }

        return 2;
    }
}
