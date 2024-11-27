import java.util.Scanner;

public class Mummy_Motivation_Speech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        boolean isTriangular = checkTriangular(array);
        System.out.println(isTriangular);
    }

    public static boolean checkTriangular(int[][] array) {
        int count = 0;
        int totalElements = array.length * array.length;
        // checking for the null matrix.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        // checking for the null matrix.
        if (count == totalElements) {
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] == 0) {
                    return false;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
