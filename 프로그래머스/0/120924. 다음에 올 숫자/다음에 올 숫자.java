class Solution {
    public int solution(int[] common) {
        int answer = 0;

        // 등차수열인지 확인
        boolean isArithmetic = true;
        int diff = common[1] - common[0];
        for (int i = 2; i < common.length; i++) {
            if (common[i] - common[i - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }

        // 등비수열인지 확인
        boolean isGeometric = true;
        if (!isArithmetic) {
            int ratio = common[1] / common[0];
            for (int i = 2; i < common.length; i++) {
                if (common[i] / common[i - 1] != ratio) {
                    isGeometric = false;
                    break;
                }
            }
        }

        // 다음 숫자 계산
        if (isArithmetic) {
            answer = common[common.length - 1] + diff;
        } else if (isGeometric) {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}
