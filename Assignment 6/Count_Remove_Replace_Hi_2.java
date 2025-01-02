import java.util.Scanner;

public class Count_Remove_Replace_Hi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int count = countHiMethod(inputString, 0);
        String remove = removeHiMethod(inputString, 0, "");
        String replaceHi = replaceHiMethod(inputString, 0, "");
        System.out.println(count);
        System.out.println(remove);
        System.out.println(replaceHi);
    }

    private static int countHiMethod(String inputString, int index) {
        if (index >= inputString.length()) {
            return 0;
        }
        if (index + 2 != inputString.length() && inputString.charAt(index) == 'h' && inputString.charAt(index + 1) == 'i' && inputString.charAt(index + 2) != 't') {
            return 1 + countHiMethod(inputString, index + 2);
        } else if (index + 2 == inputString.length() && inputString.charAt(index) == 'h' && inputString.charAt(index + 1) == 'i') {
            return 1 + countHiMethod(inputString, index + 2);
        }
        return countHiMethod(inputString, index + 1);
    }

    private static String replaceHiMethod(String inputString, int index, String ans) {
        if (index >= inputString.length()) {
            return ans;
        }
        if (index + 2 != inputString.length() && inputString.charAt(index) == 'h' && inputString.charAt(index + 1) == 'i' && inputString.charAt(index + 2) != 't') {
            return replaceHiMethod(inputString, index + 2, ans + "bye");
        } else if (index + 2 == inputString.length() && inputString.charAt(index) == 'h' && inputString.charAt(index + 1) == 'i') {
            return replaceHiMethod(inputString, index + 2, ans + "bye");
        }
        return replaceHiMethod(inputString, index + 1, ans + inputString.charAt(index));
    }

    private static String removeHiMethod(String inputString, int index, String ans) {
        if (index >= inputString.length()) {
            return ans;
        }
        if (index + 2 != inputString.length() && inputString.charAt(index) == 'h' && inputString.charAt(index + 1) == 'i' && inputString.charAt(index + 2) != 't') {
            return removeHiMethod(inputString, index + 2, ans);
        } else if (index + 2 == inputString.length() && inputString.charAt(index) == 'h' && inputString.charAt(index + 1) == 'i') {
            return removeHiMethod(inputString, index + 2, ans);
        }
        return removeHiMethod(inputString, index + 1, ans + inputString.charAt(index));
    }

}
