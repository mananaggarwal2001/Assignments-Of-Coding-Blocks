import java.util.Scanner;

public class Generate_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        displayParentheses(number, 0, 0, "");
    }

    public static void displayParentheses(int number, int openBraces, int closeBraces, String ans) {
        if (openBraces == number && closeBraces == number) {
            System.out.println(ans);
            return;
        }
        if (openBraces > number || closeBraces > number || closeBraces > openBraces) {
            return;
        }
        displayParentheses(number, openBraces, closeBraces + 1, ans + ")");
        displayParentheses(number, openBraces + 1, closeBraces, ans + "(");
    }
}
