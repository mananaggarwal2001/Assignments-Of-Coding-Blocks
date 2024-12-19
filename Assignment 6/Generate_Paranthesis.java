import java.util.Scanner;

public class Generate_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        displayParanthesis(number, 0, 0, "");
    }

    private static void displayParanthesis(int number, int openBraces, int closeBraces, String ans) {
        if (openBraces == number && closeBraces == number) {
            System.out.println(ans);
            return;
        }
        if (openBraces > number || closeBraces > number || closeBraces > openBraces) {
            return;
        }
        displayParanthesis(number, openBraces, closeBraces + 1, ans + ")");
        displayParanthesis(number, openBraces + 1, closeBraces, ans + "(");
    }
}
