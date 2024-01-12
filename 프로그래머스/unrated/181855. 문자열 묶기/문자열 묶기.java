import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        // 문자열 길이를 기준으로 그룹을 만들기 위한 맵
        HashMap<Integer, Integer> groupSizes = new HashMap<>();

        // 각 문자열의 길이를 세어서 그룹을 만듦
        for (String str : strArr) {
            int length = str.length();
            groupSizes.put(length, groupSizes.getOrDefault(length, 0) + 1);
        }

        // 가장 많은 그룹의 크기를 찾음
        for (int size : groupSizes.values()) {
            answer = Math.max(answer, size);
        }

        return answer;
    }
}
