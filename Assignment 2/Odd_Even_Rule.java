import java.util.Scanner;

public class Odd_Even_Rule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_Cases = sc.nextInt();
        while (test_Cases > 0) {
            int vehicleNumber = sc.nextInt();
            boolean runOrNot = checkNumber(vehicleNumber);
            if (runOrNot) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            test_Cases--;
        }
    }

    public static boolean checkNumber(int vehicleNumber) {
        int oddSum = 0;
        int evenSum = 0;
        int number1 = vehicleNumber;
        while (number1 > 0) {
            int remainder = number1 % 10;
            if (remainder % 2 == 0) {
                evenSum += remainder;
            } else {
                oddSum += remainder;
            }
            number1 /= 10;
        }
        return (oddSum % 3 == 0 || evenSum % 4 == 0);
    }
}
