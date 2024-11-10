import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:- ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second Number:- ");
        int number2 = sc.nextInt();
        int foundGCD = findGCD(number1, number2);
        int resultLCM = (number1 * number2) / foundGCD;
        System.out.println("The LCM of the two numbers is:- " + resultLCM);
    }

    private static int findGCD(int dividend, int divisor) {
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }
}
