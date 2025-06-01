import java.util.Arrays;
import java.util.Scanner;

public class Count_Different_Ways_To_Express {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = {1, 3, 4};
        // Initialize dp array
        long[] dp = new long[N + 1];
        Arrays.fill(dp, -1); // -1 means not computed yet

        long result = countWays(N, arr, dp);
        System.out.println(result);
    }

    public static long countWays(int target, int[] arr, long[] dp) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (dp[target] != -1) return dp[target];

        long total = 0;
        for (int num : arr) {
            total += countWays(target - num, arr, dp);
        }
        return dp[target] = total;
    }

    public static int countWaysBU(int N) {
        if (N < 0) return 0;

        int[] dp = new int[N + 1];
        dp[0] = 1;  // One way to make sum 0 (using nothing)

        for (int i = 1; i <= N; i++) {
            dp[i] += (i - 1 >= 0) ? dp[i - 1] : 0;
            dp[i] += (i - 3 >= 0) ? dp[i - 3] : 0;
            dp[i] += (i - 4 >= 0) ? dp[i - 4] : 0;
        }

        return dp[N];
    }
}
