import java.util.Scanner;

public class Nth_Triangular_Recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = findSum(number);
        System.out.println(sum);
    }

    public static int findSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + findSum(number - 1);
    }
}
