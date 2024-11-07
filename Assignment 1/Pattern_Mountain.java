import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int totalRows = number * 2 - 1;
        int spaces = totalRows - 2;
        int row = 0;
        while (row < number) {
            // print numbers
            int printnumbers = row + 1;
            int initialNumbers = 1;
            while (initialNumbers <= printnumbers) {
                System.out.print(initialNumbers + "\t");
                initialNumbers++;
            }
            // print spaces
            int initialSpaces = 0;
            while (initialSpaces < spaces) {
                System.out.print("\t");
                initialSpaces++;
            }
            // print numbers
            int finalNumbers = row + 1;
            if (row == number - 1) {
                finalNumbers = row;
            }
            while (finalNumbers >= 1) {
                System.out.print(finalNumbers + "\t");
                finalNumbers--;
            }

            // next row ki preparation.
            spaces -= 2;
            System.out.println();
            row++;
        }
    }
}
