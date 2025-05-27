import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] integer = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                integer[i][j] = sc.nextInt();
            }
        }
        int result = costSum(integer, 0, 0);
        System.out.println(result);
    }

    public static int costSum(int[][] row, int i, int j) {
        if (i == row.length - 1 && j == row[0].length - 1) {
            return row[i][j];
        }
        if (i >= row.length || j >= row[0].length) {
            return (int) (Math.pow(10, 6));
        }
        int right = costSum(row, i, j + 1);
        int down = costSum(row, i + 1, j);
        return row[i][j] + Math.min(right, down);
    }

    public static int costSumTD(int[][] row, int i, int j, int[][] dp) {
        if (i == row.length - 1 && j == row[0].length - 1) {
            return row[i][j];
        }
        if (i >= row.length || j >= row[0].length) {
            return (int) (Math.pow(10, 7));
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int right = costSumTD(row, i, j + 1, dp);
        int down = costSumTD(row, i + 1, j, dp);
        return dp[i][j] = row[i][j] + Math.min(right, down);
    }

    public static int costSumBU(int[][] array) {
        int[][] dp = new int[array.length][array[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int up = 0, left = 0;
                if (i > 0) {
                    up = array[i][j] + dp[i - 1][j];
                }
                if (j > 0) {
                    left = array[i][j] + dp[i][j - 1];
                }
                dp[i][j] = Math.min(up, left);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
