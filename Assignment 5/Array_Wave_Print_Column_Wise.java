import java.util.Scanner;

public class Array_Wave_Print_Column_Wise {
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
        printColumnWise(numberArray);
    }

    public static void printColumnWise(int[][] numberArray) {
        for (int i = 0; i < numberArray[0].length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (i % 2 == 0) {
                    System.out.print(numberArray[j][i] + ", ");
                } else {
                    System.out.print(numberArray[numberArray.length - j - 1][i] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}
