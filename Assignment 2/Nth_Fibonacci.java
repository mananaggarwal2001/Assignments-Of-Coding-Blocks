import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the fibonacci value:- ");
        int number = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        if (number == 1) {
            System.out.println(firstNumber);
        }
        if (number == 2) {
            System.out.println(secondNumber);
        }
        int foundNumber = number - 2;
        int count = 0;
        while (count <= foundNumber) {
            int temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            count++;
        }
        if (number > 2) {
            System.out.println(secondNumber);
        }
    }
}
