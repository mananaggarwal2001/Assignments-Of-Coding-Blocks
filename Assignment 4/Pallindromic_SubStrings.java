import java.util.Scanner;

public class Pallindromic_SubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result = checkSubStrings(s);
        System.out.println(result);
    }

    private static int checkSubStrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                if (isPallindrome(subString)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
