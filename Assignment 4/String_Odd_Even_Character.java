import java.util.Scanner;

public class String_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = changeString(s);
        System.out.println(result);
    }

    public static String changeString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += (char) (s.charAt(i) + 1);
            } else {
                result += (char) (s.charAt(i) - 1);
            }
        }
        return result;
    }
}
