class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;  // Initial mode is 0

        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (code.charAt(idx) != '1') {
                    if (idx % 2 == 0) {
                        answer += code.charAt(idx);
                    }
                } else {
                    mode = 1;  // Change mode to 1
                }
            } else {
                if (code.charAt(idx) != '1') {
                    if (idx % 2 != 0) {
                        answer += code.charAt(idx);
                    }
                } else {
                    mode = 0;  // Change mode to 0
                }
            }
        }

        if (answer.isEmpty()) {
            return "EMPTY";
        }

        return answer;
    }
}
