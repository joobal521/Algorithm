class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int sum = 0;

        // 문자열을 순회하면서 각 자리 숫자를 합산
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        // 합산한 값을 9로 나눈 나머지 반환
        answer=sum % 9;
        return answer;
    }
}