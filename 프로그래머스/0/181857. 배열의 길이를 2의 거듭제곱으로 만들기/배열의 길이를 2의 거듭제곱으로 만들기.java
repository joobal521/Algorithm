import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int newSize = 1;

        // 최소한의 개수로 0을 추가하여 새로운 배열의 크기 결정
        while (newSize < n) {
            newSize *= 2;
        }

        // 새로운 배열을 생성하고 기존 배열을 복사
        int[] newArr = Arrays.copyOf(arr, newSize);

        return newArr;
    }
}
