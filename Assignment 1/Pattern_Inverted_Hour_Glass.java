import java.util.Scanner;

public class Pattern_Inverted_Hour_Glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int totalRows = number * 2 + 1;
        int spaces = number * 2 - 2 + 1;
        int row = 1;
        while (row <= totalRows) {
            // number printing
            int initialNumber = 1;
            int printNumber = number;
            int printrows;
            if (row <= totalRows / 2 + 1) {
                printrows = row;
            } else {
                printrows = totalRows - row + 1;
            }
            while (initialNumber <= printrows) {
                System.out.print(printNumber + " ");
                printNumber--;
                initialNumber++;
            }
            // print number of spaces
            int initialSpaces = 1;
            while (initialSpaces <= spaces) {
                System.out.print("  ");
                initialSpaces++;
            }
            // print the remaining numbers
            int finalNumbers;
            int printFinalRows;
            if (row <= totalRows / 2 + 1) {
                printFinalRows = row;
                finalNumbers = number - row + 1;
            } else {
                printFinalRows = totalRows - row + 1;
                finalNumbers = row - (totalRows / 2 + 1);
            }
            if (row == totalRows / 2 + 1) {
                finalNumbers = 1;
                printFinalRows--;
            }
            while (printFinalRows > 0) {
                System.out.print(finalNumbers + " ");
                finalNumbers++;
                printFinalRows--;
            }
            if (row <= totalRows / 2) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
            System.out.println();
            row++;
        }
    }
}
