import java.util.Scanner;

public class hollow_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n will be the odd number
        int totalStarts = n + 1;
        int spaces = -1;
        int row = 0;
        while (row < n) {
            int trackedColumn = 0;
            if (row == 0 || row == n - 1) {
                trackedColumn = 1;
            }
            // star
            while (trackedColumn < totalStarts / 2) {
                System.out.print("* ");
                trackedColumn++;
            }
            int trackedSpace = 0;
            // space
            while (trackedSpace < spaces) {
                System.out.print("  ");
                trackedSpace++;
            }

            // star
            while (trackedColumn < totalStarts) {
                System.out.print("* ");
                trackedColumn++;
            }

            // preparation for the next row.
            if (row < n / 2) {
                spaces += 2;
                totalStarts -= 2;
            } else {
                spaces -= 2;
                totalStarts += 2;
            }
            System.out.println();
            row++;
        }
    }
}