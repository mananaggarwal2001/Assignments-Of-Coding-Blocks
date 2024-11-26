import java.util.Scanner;

public class Array_Spiral_Print_AntiClockWise {
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
        printSpiralAntiClockWise(numberArray);
    }

    private static void printSpiralAntiClockWise(int[][] numberArray) {
        int top = 0;
        int left = 0;
        int right = numberArray[0].length - 1;
        int bottom = numberArray.length - 1;
        int totalElements = numberArray.length * numberArray[0].length;
        int count = 0;
        while (count < totalElements) {
            // first we have to go from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(numberArray[i][left] + ", ");
                count++;
            }
            left++;
            // bottom from left right we have to print
            for (int i = left; i <= right; i++) {
                System.out.print(numberArray[bottom][i] + ", ");
                count++;
            }
            bottom--;
            // from right we have to go from bottom to up
            for (int i = bottom; i >= top; i--) {
                System.out.print(numberArray[i][right] + ", ");
                count++;
            }
            right--;
            // from right to left we have to do this
            for (int i = right; i >= left; i--) {
                System.out.print(numberArray[top][i] + ", ");
                count++;
            }
            top++;
        }
        System.out.print("END");
    }
}
