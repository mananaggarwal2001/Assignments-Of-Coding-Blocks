import java.util.Arrays;
import java.util.Scanner;

public class Zero_N_Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int capacity = sc.nextInt();
        int[] weights = new int[size];
        int[] value = new int[size];
        for (int i = 0; i < size; i++) {
            weights[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            value[i] = sc.nextInt();
        }
        int[][] dp = new int[size][capacity + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(zeroNKnapSackBU(weights, value, capacity));
    }

    private static int zeroNKnapSackTD(int[] weights, int[] value, int capacity, int index, int[][] dp) {
        if (index == weights.length) {
            return 0;
        }
        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }
        int pick = 0;
        if (weights[index] <= capacity) {
            pick = value[index] + zeroNKnapSackTD(weights, value, capacity - weights[index], index, dp);
        }
        int notPick = zeroNKnapSackTD(weights, value, capacity, index + 1, dp);
        return dp[index][capacity] = Math.max(pick, notPick);
    }

    public static int zeroNKnapSackBU(int[] weights, int[] values, int capacity) {
        int[][] dp = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int pick = 0;
                if (j >= weights[i - 1]) {
                    pick = values[i - 1] + dp[i][j - weights[i - 1]];
                }
                int not_pick = dp[i - 1][j];
                dp[i][j] = Math.max(pick, not_pick);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

}
