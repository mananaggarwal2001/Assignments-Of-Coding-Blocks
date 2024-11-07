import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int totalRows = number * 2 - 1;
        int trackerPointer = 0;
        int row = -1;
        int spaces = number;
        while (trackerPointer < totalRows) {
            if (trackerPointer < totalRows / 2 + 1) {
                row += 2;
            } else {
                row -= 2;
            }
            // print number of spaces.
            int initialSpaces = 0;
            while (initialSpaces < spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            // print the number of rows
            int printNumber;
            if (trackerPointer <= totalRows / 2) {
                printNumber = trackerPointer + 1;
            } else {
                printNumber = totalRows - trackerPointer ;
            }
            int column = 1;
            while (column <= row) {
                System.out.print(printNumber + " ");
                if (column <= row / 2) {
                    printNumber++;
                } else {
                    printNumber--;
                }
                column++;
            }
            if (trackerPointer < totalRows / 2) {
                spaces--;
            } else {
                spaces++;
            }
            System.out.println();
            trackerPointer++;
        }

    }
}
