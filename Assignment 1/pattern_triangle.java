import java.util.Scanner;

public class pattern_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int n = sc.nextInt();
        int spaces = n;
        int row = 1;
        int trackedRows = 0;
        while (trackedRows < n) {
            // spaces for printing the numbers.
            int initialSpaces = spaces;
            while (initialSpaces > 0) {
                System.out.print("\t");
                initialSpaces--;
            }
            // numbers printing
            int numbers = trackedRows + 1;
            int trackerRow = 1;
            while (trackerRow <= row) {
                System.out.print(numbers+ "\t");
                if (trackerRow <= trackedRows) {
                    numbers++;
                } else {
                    numbers--;
                }
                trackerRow++;
            }

            // next row ki preparation.
            row += 2;
            System.out.println();
            spaces--;
            trackedRows++;
        }
    }
}
