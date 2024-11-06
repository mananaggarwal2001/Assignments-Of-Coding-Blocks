import java.util.Scanner;

public class pattern_number_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows:- ");
        int number = sc.nextInt();
        int columnNumber = 1;
        int row = 0;
        while (row < number) {
            int initialRows = 0;
            while (initialRows <= row) {
                System.out.print(columnNumber + " ");
                columnNumber++;
                initialRows++;
            }
            System.out.println();
            row++;
        }
    }
}
