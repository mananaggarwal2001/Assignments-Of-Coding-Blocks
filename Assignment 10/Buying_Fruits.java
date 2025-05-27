import java.util.Arrays;
import java.util.Scanner;

public class Buying_Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int fruitSellers = sc.nextInt();
            int[][] fruits = new int[fruitSellers][3];
            for (int i = 0; i < fruitSellers; i++) {
                for (int j = 0; j < fruits[0].length; j++) {
                    fruits[i][j] = sc.nextInt();
                }
            }
            int[][] dp = new int[fruits.length][3];
            for (int[] arr : dp) {
                Arrays.fill(arr, (int) Math.pow(10, 7));
            }
            testcases--;
        }
    }
}
