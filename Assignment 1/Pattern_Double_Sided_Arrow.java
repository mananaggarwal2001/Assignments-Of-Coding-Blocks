import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int startSpaces = number;
        int secondSpaces = -1;

        int row = 1;
        while (row <= number) {
            int innerSpaces = 1;
            while (innerSpaces <= startSpaces) {
                System.out.print("  ");
                innerSpaces++;
            }
            // numbers
            int innerNumber;
            int endNumbers;
            if (row <= number / 2 + 1) {
                innerNumber = row;
                endNumbers = row;
            } else {
                innerNumber = number - row + 1;
                endNumbers = number - row + 1;
            }
            while (innerNumber >= 1) {
                System.out.print(innerNumber + " ");
                innerNumber--;
            }

            // print middle spaces.
            int middleSpacePrint = 1;
            while (middleSpacePrint <= secondSpaces) {
                System.out.print("  ");
                middleSpacePrint++;
            }
            // print end Numbers
            int printEndNumbers = 1;
            if (row == 1 || row == number) {
                printEndNumbers = 2;
            }
            while (printEndNumbers <= endNumbers) {
                System.out.print(printEndNumbers + " ");
                printEndNumbers++;
            }
            if (row <= number / 2) {
                secondSpaces += 2;
                startSpaces -= 2;
            } else {
                secondSpaces -= 2;
                startSpaces += 2;
            }
            row++;
            System.out.println();
        }
    }
}
