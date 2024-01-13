import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // 문자열로 주어진 정수를 BigInteger로 변환하여 더하고, 그 값을 문자열로 반환
        BigInteger result = new BigInteger(a).add(new BigInteger(b));
        return result.toString();
    }
}
