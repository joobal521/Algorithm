import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        // 배열의 각 숫자의 빈도수를 저장하는 Map 생성
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 최빈값과 그 빈도수를 저장하는 변수
        int mode = -1;
        int maxFrequency = 0;

        // 배열 순회하며 빈도수 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            int currentFrequency = frequencyMap.get(num);

            // 현재 숫자의 빈도수가 최빈값의 빈도수보다 큰 경우 갱신
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mode = num;
            } else if (currentFrequency == maxFrequency) {
                // 최빈값이 여러 개인 경우 -1 반환
                mode = -1;
            }
        }

        return mode;
    }
}
