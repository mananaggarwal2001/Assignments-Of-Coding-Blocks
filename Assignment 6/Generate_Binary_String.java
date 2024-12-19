import java.util.Scanner;

public class Generate_Binary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            String ques = sc.next();
            displayStrings(ques, "");
            test--;
        }
    }

    private static void displayStrings(String ques, String ans) {
        if (ques.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        if (ques.charAt(0) == '?') {
            displayStrings(ques.substring(1), ans + '0');
            displayStrings(ques.substring(1), ans + '1');
        } else {
            displayStrings(ques.substring(1), ans + ques.charAt(0));
        }
    }
}
