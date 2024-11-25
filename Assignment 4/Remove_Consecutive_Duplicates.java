import java.util.Scanner;

public class Remove_Consecutive_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = removeDuplicates(s);
        System.out.println(result);
    }

    public static String removeDuplicates(String s) {
        String result = "";
        char variable = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (variable != s.charAt(i)) {
                result += variable;
                variable = s.charAt(i);
            }
        }
        result += s.charAt(s.length() - 1);
        return result;
    }
}
