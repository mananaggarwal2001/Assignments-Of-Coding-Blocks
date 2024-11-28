import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] booleanArray = new int[m][n];
        for (int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray[0].length; j++) {
                booleanArray[i][j] = sc.nextInt();
            }
        }
        changeMatrix(booleanArray);
        for (int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray[0].length; j++) {
                System.out.print(booleanArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void changeMatrix(int[][] booleanArray) {
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        for (int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray[0].length; j++) {
                if (booleanArray[i][j] == 1) {
                    arrayList.add(new Integer[]{i, j});
                }
            }
        }
        for (Integer[] value : arrayList) {
            // for row
            for (int i = 0; i < booleanArray[0].length; i++) {
                booleanArray[value[0]][i] = 1;
            }
            // for column we will use this approach.
            for (int i = 0; i < booleanArray.length; i++) {
                booleanArray[i][value[1]] = 1;
            }
        }
    }
}
