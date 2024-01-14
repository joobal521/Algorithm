class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            // 주어진 범위의 문자열을 뒤집음
            reverseSubstring(sb, start, end);
        }

        return sb.toString();
    }

    private void reverseSubstring(StringBuilder sb, int start, int end) {
        // start부터 end까지의 부분 문자열을 뒤집음
        sb.replace(start, end + 1, new StringBuilder(sb.substring(start, end + 1)).reverse().toString());
    }
}
