import java.util.Scanner;

public class Array_Spiral_Print_Clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        printMatrix(array);
    }

    public static void printMatrix(int[][] array) {
        int left = 0;
        int right = array[0].length - 1;
        int top = 0;
        int bottom = array.length - 1;
        int count = 0;
        int totalElements = array.length * array[0].length;
        while (count < totalElements) {
            // first print the row in the matrix.
            for (int i = left; i <= right && count < totalElements; i++) {
                System.out.print(array[top][i] + ", ");
                count++;
            }
            top++;
            // print right row in the up to down direction.
            for (int i = top; i <= bottom && count < totalElements; i++) {
                System.out.print(array[i][right] + ", ");
                count++;
            }
            right--;
            // print bottom from right to left in the matrix.
            for (int i = right; i >= left && count < totalElements; i--) {
                System.out.print(array[bottom][i] + ", ");
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top && count < totalElements; i--) {
                System.out.print(array[i][left] + ", ");
                count++;
            }
            left++;
        }
        System.out.print("END");
    }
}
