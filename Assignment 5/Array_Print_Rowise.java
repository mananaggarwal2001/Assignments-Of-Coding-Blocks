import java.util.Scanner;

public class Array_Print_Rowise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] numberArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                numberArray[i][j] = sc.nextInt();
            }
        }
        printRows(numberArray);
    }

    public static void printRows(int[][] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[0].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(numberArray[i][j] + ",");
                } else {
                    System.out.print(numberArray[i][numberArray[0].length - j - 1] + ",");
                }
            }
        }
        System.out.print("END");
    }
}
