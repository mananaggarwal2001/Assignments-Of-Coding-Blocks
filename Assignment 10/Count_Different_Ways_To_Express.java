import java.util.Arrays;
import java.util.Scanner;

public class Count_Different_Ways_To_Express {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = {1, 3, 4};
        int[][] dp = new int[arr.length][number + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int result = numberCount(number, arr, 0, dp);
        for (int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(result);
    }

    public static int numberCount(int number, int[] arr, int index, int[][] dp) {
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return 0;
        }
        if (dp[index][number] != -1) {
            return dp[index][number];
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += numberCount(number - arr[i], arr, i, dp);
        }
        return dp[index][number] = result;
    }
}
