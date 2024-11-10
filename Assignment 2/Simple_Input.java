import java.util.Scanner;

public class Simple_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while (sum >= 0) {
            long number = sc.nextLong();
            sum += number;
            if (sum >= 0) {
                System.out.println(number);
            }
        }
    }
}
