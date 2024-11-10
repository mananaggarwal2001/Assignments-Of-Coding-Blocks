import java.util.Scanner;

public class GCD_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        long first_number = sc.nextLong();
        System.out.print("Enter the second number:- ");
        long second_number = sc.nextLong();
        long result = findGCD(first_number, second_number);
        System.out.println("The GCD of the number is:- " + result);
    }

    public static long findGCD(long first_number, long second_number) {
        long dividend = first_number;
        long divisor = second_number;
        while (dividend % divisor != 0) {
            long remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }
}
