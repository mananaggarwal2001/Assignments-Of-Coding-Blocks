import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int totalRows = number * 2 - 1;
        int stars = number * 2;
        int spaces = -1;
        int rows = 1;
        while (rows <= totalRows) {
            int initialStars = 1;
            // first print stars for getting the things done.
            while (initialStars <= stars / 2) {
                System.out.print("*");
                initialStars++;
            }
            // then print spaces
            int initialSpace = 1;
            while (initialSpace <= spaces) {
                System.out.print(" ");
                initialSpace++;
            }
            // then print finally the others half of the stars.
            int finalstars = 1;
            if (rows == 1 || rows == totalRows) {
                finalstars = 2;
            }
            while (finalstars <= stars / 2) {
                System.out.print("*");
                finalstars++;
            }
            // mirroring technique is being used.
            if (rows <= totalRows / 2) {
                spaces += 2;
                stars -= 2;
            } else {
                spaces -= 2;
                stars += 2;
            }
            rows++;
            System.out.println();
        }
    }
}
