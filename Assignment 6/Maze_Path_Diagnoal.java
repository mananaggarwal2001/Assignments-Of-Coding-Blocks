import java.util.Scanner;

public class Maze_Path_Diagnoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int result = printPaths(row, column, 0, 0, "");
        System.out.println();
        System.out.println(result);
    }

    public static int printPaths(int row, int column, int currentRow, int currentColumn, String ans) {
        if (row - 1 == currentRow && column - 1 == currentColumn) {
            System.out.print(ans + " ");
            return 1;
        }
        if (currentRow > row - 1 || currentColumn > column - 1) {
            return 0;
        }
        int f2 = printPaths(row, column, currentRow + 1, currentColumn, ans + "V");
        int f1 = printPaths(row, column, currentRow, currentColumn + 1, ans + "H");
        int f3 = printPaths(row, column, currentRow + 1, currentColumn + 1, ans + "D");
        return f1 + f2 + f3;
    }
}
