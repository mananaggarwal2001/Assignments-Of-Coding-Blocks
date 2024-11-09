import java.util.Scanner;

public class Pattern_Hour_Glass {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows:- ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int totalRows = number * 2 + 1;
        int spaces = 1;
        int row = 1;
        while (row <= totalRows) {
            // print spaces
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            // print number
            int printNumber;
            if (row <= totalRows / 2 + 1) {
                printNumber = number - row + 1;
            } else {
                printNumber = row - number - 1;
            }
            while (printNumber >= 0) {
                System.out.print(printNumber + " ");
                printNumber--;
            }
            // print Remaining Numbers
            int finalTargetNumber;
            if (row <= totalRows / 2 + 1) {
                finalTargetNumber = number - row + 1;
            } else {
                finalTargetNumber = row - number - 1;
            }
            int printFinalNumbers = 1;
            while (printFinalNumbers <= finalTargetNumber) {
                System.out.print(printFinalNumbers + " ");
                printFinalNumbers++;
            }

            row++;
            if (row <= totalRows / 2 + 1) {
                spaces++;
            } else {
                spaces--;
            }
            System.out.println();
        }
    }
}
