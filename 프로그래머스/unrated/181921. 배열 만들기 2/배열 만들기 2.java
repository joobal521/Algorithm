import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num = l; num <= r; num++) {
            if (isOnlyZeroAndFive(num)) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isOnlyZeroAndFive(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
