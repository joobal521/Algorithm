class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int count = 0;
        int tempN = n; // n의 값을 변경하지 않기 위해 임시 변수 사용

        // 콜라츠 수열의 길이를 구함
        while (tempN != 1) {
            if (tempN % 2 == 0) {
                tempN = tempN / 2;
            } else {
                tempN = 3 * tempN + 1;
            }
            count++;
        }

        // 배열 초기화
        answer = new int[count + 1];
        tempN = n; // 다시 초기값으로 설정

        // 콜라츠 수열을 배열에 저장
        for (int i = 0; i <= count; i++) {
            answer[i] = tempN;
            if (tempN % 2 == 0) {
                tempN = tempN / 2;
            } else {
                tempN = 3 * tempN + 1;
            }
        }

        return answer;
    }
}
