import java.util.Scanner;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int row = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        if (number >= 1) {
            System.out.println(firstNumber + " ");
            row++;
        }
        if (number >= 2) {
            System.out.print(secondNumber + " ");
            int temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            System.out.print(temp + " ");
            System.out.println();
            row++;
        }
        while (row < number) {
            int initialValues = 0;
            while (initialValues <= row) {
                int temp = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
                System.out.print(temp + " ");
                initialValues++;
            }
            System.out.println();
            row++;
        }
    }
}
