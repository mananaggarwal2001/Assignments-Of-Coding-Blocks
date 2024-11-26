import java.util.Scanner;
public class Matrix_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int result = searchMatrix(matrix, target);
        System.out.println(result);
    }

    public static int searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return 1;
            }
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return 0;
    }
}
