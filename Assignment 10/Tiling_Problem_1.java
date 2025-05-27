import java.util.Arrays;
import java.util.Scanner;

public class Tiling_Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] dp = new int[input + 1];
        Arrays.fill(dp, -1);
        int result = arrangementsBU(input);
        System.out.println(result);
    }

    private static int arrangements(int columns) {
        if (columns == 0) {
            return 1;
        }
        if (columns < 0) {
            return 0;
        }
        int horizontal = arrangements(columns - 1);
        int vertical = arrangements(columns - 2);
        return horizontal + vertical;
    }

    private static int arrangementsTD(int columns, int[] dp) {
        if (columns == 0) {
            return 1;
        }
        if (columns < 0) {
            return 0;
        }
        if (dp[columns] != -1) {
            return dp[columns];
        }
        int horizontal = arrangementsTD(columns - 1, dp);
        int vertical = arrangementsTD(columns - 2, dp);
        return dp[columns] = horizontal + vertical;
    }

    private static int arrangementsBU(int columns) {
        int[] dp = new int[columns + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }
}
