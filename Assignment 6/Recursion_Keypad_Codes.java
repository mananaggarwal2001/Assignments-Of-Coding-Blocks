import java.util.Scanner;

public class Recursion_Keypad_Codes {
    static String[] telephoneNumber = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        displayDials(input, "");
        System.out.println();
        int count = countDials(input, "");
        System.out.println(count);
    }

    private static int countDials(String input, String ans) {
        if (input.isEmpty()) {
            return 1;
        }
        char ch = input.charAt(0);
        String extractString = telephoneNumber[ch - '0'];
        int count = 0;
        for (int i = 0; i < extractString.length(); i++) {
            count += countDials(input.substring(1), ans + extractString.charAt(i));
        }
        return count;
    }

    private static void displayDials(String input, String ans) {
        if (input.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = input.charAt(0);
        String extractString = telephoneNumber[ch - '0'];
        for (int i = 0; i < extractString.length(); i++) {
            displayDials(input.substring(1), ans + extractString.charAt(i));
        }
    }
}
