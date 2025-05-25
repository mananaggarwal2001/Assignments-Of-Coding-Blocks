import java.util.Arrays;
import java.util.Scanner;

public class Coin_Change {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[size][target + 1];
        for (int[] dprow : dp) {
            Arrays.fill(dprow, -1);
        }
        long result = findPossiblityRecursionBU(arr, target);
        System.out.println(result);
    }

    private static int findPossiblitiesRecursionTD(int[] arr, int target, int index, int[][] dp) {
        if (target == 0) {
            return 1;
        }
        if (index == arr.length || target < 0) {
            return 0;
        }
        if (dp[index][target] != -1) {
            return dp[index][target];
        }
        long pick = findPossiblitiesRecursionTD(arr, target - arr[index], index, dp);
        long not_pick = findPossiblitiesRecursionTD(arr, target, index + 1, dp);
        return dp[index][target] = (int) ((pick + not_pick) % MOD);
    }

    private static int findPossiblitiesRecursion(int[] arr, int target, int index) {
        if (target == 0) {
            return 1;
        }
        if (index == arr.length || target < 0) {
            return 0;
        }
        long pick = findPossiblitiesRecursion(arr, target - arr[index], index);
        long not_pick = findPossiblitiesRecursion(arr, target, index + 1);
        return (int) ((pick + not_pick) % MOD);
    }

    private static int findPossiblityRecursionBU(int[] arr, int target) {
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                int pick = 0;
                if (arr[i - 1] <= j) {
                    pick = dp[i][j - arr[i - 1]];
                }
                int Not_pick = dp[i - 1][j];
                dp[i][j] = (int) ((pick + Not_pick) % MOD);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
