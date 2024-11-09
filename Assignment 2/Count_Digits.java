import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int inputNumber = sc.nextInt();
        int number = inputNumber;
        System.out.print("Enter the digit for which you want to find the occurances:- ");
        int digit = sc.nextInt();
        checkOccurances(number, digit);

    }

    public static void checkOccurances(int number, int digit) {
        int inputNumber = number;
        int count = 0;
        while (number > 0) {
            int value = number % 10;
            if (value == digit) {
                count++;
            }
            number /= 10;
        }
        System.out.println("The occurances of digit " + digit + " in number " + inputNumber + " is:- " + count);
    }
}
