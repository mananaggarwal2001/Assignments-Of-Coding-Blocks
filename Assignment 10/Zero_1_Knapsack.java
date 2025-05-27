import java.util.Arrays;
import java.util.Scanner;

public class Zero_1_Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int capacity = sc.nextInt();
        int[] values = new int[size];
        int[] weights = new int[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextInt();
        }
        int[][] dp = new int[size][capacity + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int result = countCapacityNameBU(weights, values, capacity);
        System.out.println(result);
    }

    private static int countCapacityName(int[] weights, int[] values, int capacity, int index) {
        if (index == weights.length) {
            return 0;
        }
        int pick = 0;
        if (weights[index] <= capacity) {
            pick = values[index] + countCapacityName(weights, values, capacity - weights[index], index + 1);
        }
        int Not_Pick = countCapacityName(weights, values, capacity, index + 1);
        return Math.max(pick, Not_Pick);
    }

    private static int countCapacityNameTD(int[] weights, int[] values, int capacity, int index, int[][] dp) {
        if (index == weights.length) {
            return 0;
        }
        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }
        int pick = 0;
        if (weights[index] <= capacity) {
            pick = values[index] + countCapacityNameTD(weights, values, capacity - weights[index], index + 1, dp);
        }
        int Not_Pick = countCapacityNameTD(weights, values, capacity, index + 1, dp);
        return dp[index][capacity] = Math.max(pick, Not_Pick);
    }

    private static int countCapacityNameBU(int[] weights, int[] values, int capacity) {
        int[][] dp = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int pick = 0;
                if (weights[i - 1] <= j) {
                    pick = values[i - 1] + dp[i - 1][j - weights[i - 1]];
                }
                int Not_Pick = dp[i - 1][j];
                dp[i][j] = Math.max(pick, Not_Pick);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
