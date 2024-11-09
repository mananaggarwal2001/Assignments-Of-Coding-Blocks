import java.util.Scanner;

public class Print_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the reverse of number:- ");
        long number = sc.nextLong();
        long reverseNumber = 0;
        while (number > 0) {
            long value = number % 10;
            reverseNumber *= 10;
            reverseNumber += value;
            number /= 10;
        }
        System.out.println("The reverse of number is:- " + reverseNumber);
    }
}
