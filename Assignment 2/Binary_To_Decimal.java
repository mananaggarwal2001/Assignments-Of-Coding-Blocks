import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number for which you want to find the decimal of the number:- ");
        long number = sc.nextLong();
        long power = 0;
        long decimalNumber = 0;
        while (number > 0) {
            long remainder = number % 10;
            decimalNumber += (long) (remainder * Math.pow(2, power));
            power++;
            number /= 10;
        }
        System.out.println("The decimal Number of the binary number is:- " + decimalNumber);
    }
}
