import java.util.Scanner;

public class Count_Remove_Replace_Hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = counthi(input, 0);
        String ans = removeHi(input, 0, "");
        String replaceString = replaceHi(input, 0, "");
        System.out.println(count);
        System.out.println(ans);
        System.out.println(replaceString);
    }

    private static String replaceHi(String input, int index, String ans) {
        if (index >= input.length()) {
            return ans;
        }
        if (index + 1 != input.length() && input.charAt(index) == 'h' && input.charAt(index + 1) == 'i') {
            return replaceHi(input, index + 2, ans + "bye");
        }
        return replaceHi(input, index + 1, ans + input.charAt(index));
    }

    private static String removeHi(String input, int index, String ans) {
        if (index >= input.length()) {
            return ans;
        }
        if (index + 1 != input.length() && input.charAt(index) == 'h' && input.charAt(index + 1) == 'i') {
            return removeHi(input, index + 2, ans);
        }
        return removeHi(input, index + 1, ans + input.charAt(index));
    }

    private static int counthi(String input, int index) {
        if (index >= input.length()) {
            return 0;
        }
        if (index + 1 != input.length() && input.charAt(index) == 'h' && input.charAt(index + 1) == 'i') {
            return 1 + counthi(input, index + 2);
        }
        return counthi(input, index + 1);
    }
}
