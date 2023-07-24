package prj1;

public class StringToNumber {
    public static void main(String[] args) {
        String str = "25";
        int number = convertToNumber(str);
        System.out.println("숫자로 변환된 값: " + number);
    }

    public static int convertToNumber(String str) {
        if (!isNumericString(str)) {
            throw new IllegalArgumentException("유효하지 않은 숫자 문자열입니다: " + str);
        }

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digitValue = c - '0';
            result = result * 10 + digitValue;
        }

        return result;
    }

    public static boolean isNumericString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
