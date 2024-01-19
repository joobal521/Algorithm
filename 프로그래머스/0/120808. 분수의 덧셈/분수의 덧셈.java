class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 1. 두 분수의 공통 분모 구하기
        int commonDenom = lcm(denom1, denom2);

        // 2. 두 분수의 분자를 공통 분모에 맞게 변환
        int newNumer1 = numer1 * (commonDenom / denom1);
        int newNumer2 = numer2 * (commonDenom / denom2);

        // 3. 두 분수의 분자를 더한 값과 공통 분모로 새로운 분수 생성
        int sumNumer = newNumer1 + newNumer2;

        // 4. 새로운 분수를 기약 분수로 만들기
        int gcd = gcd(sumNumer, commonDenom);

        // 기약 분수로 만들기
        answer[0] = sumNumer / gcd;
        answer[1] = commonDenom / gcd;

        return answer;
    }

    // 최대 공약수(GCD) 계산
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // 최소 공배수(LCM) 계산
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
