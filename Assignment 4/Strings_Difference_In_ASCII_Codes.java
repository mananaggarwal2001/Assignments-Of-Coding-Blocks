import java.util.Scanner;

public class Strings_Difference_In_ASCII_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = checkString(s);
        System.out.println(result);
    }

    public static String checkString(String s) {
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            int difference = s.charAt(i + 1) - s.charAt(i);
            result += String.valueOf(s.charAt(i)) + difference;
        }
        result += s.charAt(s.length() - 1);
        return result;
    }
}
