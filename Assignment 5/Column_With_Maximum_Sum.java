import java.util.Scanner;

public class Column_With_Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] matrix = new int[number][number];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] result2 = findMaxValue2(matrix);
        System.out.print((result2[1] + 1) + " " + result2[0]);
    }

    public static int[] findMaxValue2(int[][] matrix) {
        int sum = 0;
        int result = Integer.MIN_VALUE;
        int column = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > result) {
                result = sum;
                column = i;
            }
            sum = 0;
        }
        return new int[]{result, column};
    }
}
