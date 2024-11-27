import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] squareArray = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                squareArray[i][j] = sc.nextInt();
            }
        }
        int[][] resultMatrix = doRotateMatrix(squareArray);
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] doRotateMatrix(int[][] squareArray) {
        int[][] newArray = new int[squareArray.length][squareArray.length];
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                newArray[i][j] = squareArray[j][squareArray.length - i - 1];
            }
        }
        return newArray;
    }
}
