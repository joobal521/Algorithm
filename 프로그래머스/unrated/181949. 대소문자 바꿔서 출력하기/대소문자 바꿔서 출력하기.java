import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String result = convertCase(str);
        
        System.out.println(result);
    }
    
    private static String convertCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                // 다른 문자(숫자, 특수문자 등)는 그대로 추가
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
