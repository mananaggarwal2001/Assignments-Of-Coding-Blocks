import java.util.Scanner;

public class R4_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int row = 1;
        while (row <= number) {
            int column = 1;
            while (column <= row) {
                System.out.print("*");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
