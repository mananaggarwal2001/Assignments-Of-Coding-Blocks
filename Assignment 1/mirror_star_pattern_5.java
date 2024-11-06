import java.util.Scanner;

public class mirror_star_pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int stars = 1;
        int spaces = number;
        int row = 0;
        while (row < number) {
            int intialSpaces = 0;
            while (intialSpaces < spaces) {
                System.out.print("\t");
                intialSpaces++;
            }

            // stars
            int initialStars = 0;
            while (initialStars < stars) {
                System.out.print("*" + "\t");
                initialStars++;
            }


            // next row ki preparation
            if (row < number / 2) {
                stars += 2;
                spaces --;
            } else {
                stars -= 2;
                spaces ++;
            }
            row++;
            System.out.println();
        }
    }
}
