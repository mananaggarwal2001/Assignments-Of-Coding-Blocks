import java.util.Scanner;

public class Replace_Them_All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        long number = sc.nextLong();
        String numberString = String.valueOf(number);
        long sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            int digit = numberString.charAt(i) - '0';
            sum *= 10;
            if (digit == 0) {
                sum += 5;
            } else {
                sum += digit;
            }
        }
        System.out.println("The result number is:- " + sum);
    }
}
