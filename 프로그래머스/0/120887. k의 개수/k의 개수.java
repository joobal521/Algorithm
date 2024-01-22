class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            // 현재 숫자 num에서 k가 몇 번 등장하는지 체크
            answer += countOccurrences(num, k);
        }

        return answer;
    }

    // 숫자 num에서 digit이 몇 번 등장하는지를 계산하는 함수
    private int countOccurrences(int num, int digit) {
        int count = 0;

        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}
