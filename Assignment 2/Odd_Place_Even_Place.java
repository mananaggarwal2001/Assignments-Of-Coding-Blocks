import java.util.Scanner;
public class Odd_Place_Even_Place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the sum:- ");
        int number = sc.nextInt();
        int count = 1;
        int oddSum = 0;
        int evenSum = 0;
        while (number > 0) {
            int value = number % 10;
            if (count % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
            count++;
            number /= 10;
        }
        System.out.println("The Odd Place Sum is :- " + oddSum);
        System.out.println("The Even Place Sum is :- " + evenSum);
    }
}
