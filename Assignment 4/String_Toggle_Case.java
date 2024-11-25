import java.util.Locale;
import java.util.Scanner;

public class String_Toggle_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String returnedString = changeCase(s);
        System.out.println(returnedString);
    }

    public static String changeCase(String s) {
        String combinedString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                combinedString += String.valueOf(s.charAt(i)).toLowerCase();
            } else {
                combinedString += String.valueOf(s.charAt(i)).toUpperCase();
            }
        }
        return combinedString;
    }
}
