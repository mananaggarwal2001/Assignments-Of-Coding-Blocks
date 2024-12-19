import java.util.Scanner;

public class Recursion_Subsequence_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        printSubSequence(inputString, "");
        int count = countSubSequence(inputString, "");
        System.out.println();
        System.out.println(count);
    }

    private static void printSubSequence(String inputString, String ans) {
        if (inputString.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        printSubSequence(inputString.substring(1), ans);
        printSubSequence(inputString.substring(1), ans + inputString.charAt(0));
    }

    public static int countSubSequence(String inputString, String ans) {
        if (inputString.isEmpty()) {
            return 1;
        }
        int c1 = countSubSequence(inputString.substring(1), ans);
        int c2 = countSubSequence(inputString.substring(1), ans + inputString.charAt(0));
        return c1 + c2;
    }
}
