class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;

        // myString을 순회하면서 pat이 등장하는 횟수 계산
        while ((index = myString.indexOf(pat, index)) != -1) {
            answer++;
            index += 1; // 다음 검색을 위해 인덱스를 1 증가
        }

        return answer;
    }
}
