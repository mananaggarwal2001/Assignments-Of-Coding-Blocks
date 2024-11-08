import java.util.Scanner;
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int numberOfRows = sc.nextInt();
        // we need to remember that we need to start row and col from 0 only.
        int row = 0;
        while (row < numberOfRows) {
            int col = 0;
            int ncr = 1;
            while (col <= row) {
                System.out.print(ncr + " ");
                ncr = ((row - col) * ncr) / (col + 1);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
