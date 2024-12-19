import java.util.Scanner;

public class Odd_Even_Using_Recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNumbers(number);
    }

    public static void printNumbers(int number) {
        if (number == 0) {
            return;
        }
        if (number % 2 != 0) {
            System.out.println(number);
        }
        printNumbers(number - 1);
        if (number % 2 == 0) {
            System.out.println(number);
        }
    }
}
