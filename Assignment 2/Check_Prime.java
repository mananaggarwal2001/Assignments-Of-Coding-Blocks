import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for the prime:- ");
        long number = sc.nextLong();
        int count = 0;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
