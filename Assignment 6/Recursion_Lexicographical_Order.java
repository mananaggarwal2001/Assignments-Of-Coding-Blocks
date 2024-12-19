import java.util.Scanner;

public class Recursion_Lexicographical_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        displayOrder(number, 0);
    }

    public static void displayOrder(int number, int current) {
        if (current > number) {
            return;
        }
        System.out.print(current + " ");
        int i = 0;
        if (current == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            displayOrder(number, (current * 10) + i);
        }
    }
}
