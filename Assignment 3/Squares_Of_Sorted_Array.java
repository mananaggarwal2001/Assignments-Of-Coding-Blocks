import java.util.Arrays;
import java.util.Scanner;

public class Squares_Of_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        findSquares(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    private static void findSquares(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) Math.pow(numberArray[i], 2);
        }
        Arrays.sort(numberArray);
    }
}
