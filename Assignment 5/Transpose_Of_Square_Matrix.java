import java.util.Arrays;
import java.util.Scanner;

public class Transpose_Of_Square_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] squareMatrix = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                squareMatrix[i][j] = sc.nextInt();
            }
        }
        transposeMatrix(squareMatrix);
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void transposeMatrix(int[][] squareMatrix) {
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i + 1; j < squareMatrix[0].length; j++) {
                int temp = squareMatrix[i][j];
                squareMatrix[i][j] = squareMatrix[j][i];
                squareMatrix[j][i] = temp;
            }
        }
    }
}
