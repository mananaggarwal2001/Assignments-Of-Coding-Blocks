import java.util.Scanner;

public class hollow_rhombus_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int spaces = number;
        int row = 0;
        while (row < number) {
            int initialSpaces = 0;
            while (initialSpaces < spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            int initialStars = 0;
            while (initialStars < number) {
                if (row > 0 && row < number - 1 && initialStars > 0 && initialStars < number - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                initialStars++;
            }
            row++;
            spaces--;
            System.out.println();
        }
    }
}
