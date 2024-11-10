import java.util.Scanner;

public class Inverse_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position of the digits:- ");
        long digitNumber = sc.nextLong();
        int count = 1;
        long result = 0;
        while (digitNumber > 0) {
            long number = digitNumber % 10;
            result += (long) (Math.pow(10, number - 1) * count);
            digitNumber /= 10;
            count++;
        }
        System.out.println("The result Number is:- " + result);
    }
}
