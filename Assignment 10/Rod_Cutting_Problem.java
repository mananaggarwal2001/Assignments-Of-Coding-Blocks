import java.util.Arrays;
import java.util.Scanner;

public class Rod_Cutting_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int result = cutTheRodBU(arr, target);
        System.out.println(result);
    }

    private static int cutTheRod(int[] arr, int target, int index) {
        if (index > arr.length) {
            return 0;
        }
        int cut = 0;
        if (index <= target) {
            cut = arr[index - 1] + cutTheRod(arr, target - index, index);
        }
        int NotCut = cutTheRod(arr, target, index + 1);
        return Math.max(cut, NotCut);
    }

    private static int cutTheRodTD(int[] arr, int target, int index, int[][] dp) {
        if (index > arr.length) {
            return 0;
        }
        if (dp[index][target] != -1) {
            return dp[index][target];
        }
        int cut = 0;
        if (index <= target) {
            cut = arr[index - 1] + cutTheRodTD(arr, target - index, index, dp);
        }
        int NotCut = cutTheRodTD(arr, target, index + 1, dp);
        return dp[index][target] = Math.max(cut, NotCut);
    }

    public static int cutTheRodBU(int[] arr, int target) {
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                int cut = 0, notCut = 0;
                if (i <= j) {
                    cut = arr[i - 1] + dp[i][j - i];
                }
                notCut = dp[i - 1][j];
                dp[i][j] = Math.max(cut, notCut);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
