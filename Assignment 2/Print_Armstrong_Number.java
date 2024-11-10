import java.util.Scanner;

public class Print_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int i) {
        int count = String.valueOf(i).length();
        int sum = 0;
        int number = i;
        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, count);
            number /= 10;
        }
        return sum == i;
    }
}
