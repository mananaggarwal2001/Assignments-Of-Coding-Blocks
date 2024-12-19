import java.util.Scanner;

public class Ultra_Fast_Mathemetics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            String number1 = sc.next();
            String number2 = sc.next();
            String result = findResult(number1, number2);
            System.out.println(result);
            test--;
        }
    }

    public static String findResult(String number1, String number2) {
        String result = "";
        for (int i = 0; i < number1.length(); i++) {
            int n1 = number1.charAt(i) - '0';
            int n2 = number2.charAt(i) - '0';
            result += (n1 ^ n2);
        }
        return result;
    }
}
