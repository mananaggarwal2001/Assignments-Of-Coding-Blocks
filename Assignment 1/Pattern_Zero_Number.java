import java.util.Scanner;

public class Pattern_Zero_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int number = sc.nextInt();
        int rowNumber = 1;
        while (rowNumber <= number) {
            int column = 1;
            while (column <= rowNumber) {
                if (column == 1 || column == rowNumber) {
                    System.out.print(rowNumber + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
                column++;
            }
            rowNumber++;
            System.out.println();
        }
    }
}
