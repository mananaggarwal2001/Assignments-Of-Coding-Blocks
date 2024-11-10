import java.util.Scanner;

public class Boston_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int sumOfDigits = digitSum(number1);
        int factorDigits = digitFactors(number1);
        if (sumOfDigits == factorDigits) {
            System.out.println("Boston Number");
        } else {
            System.out.println("Not a Boston Number");
        }
    }

    private static int digitFactors(int number1) {
        int count = 2;
        int resultNumber = number1;
        int sumFactors = 0;
        while (count <= resultNumber) {
            if (resultNumber % count == 0 && checkPrime(count)) {
                sumFactors += digitSum(count);
                resultNumber /= count;
                continue;
            }
            count++;
        }
        return sumFactors;
    }

    public static boolean checkPrime(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int digitSum(int number1) {
        int sum = 0;
        int checkNumber = number1;
        while (checkNumber > 0) {
            int remainder = checkNumber % 10;
            sum += remainder;
            checkNumber /= 10;
        }
        return sum;
    }
}
