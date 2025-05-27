import java.util.Arrays;
import java.util.Scanner;

public class K_Order_LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[M];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        int[][] dp = new int[N][M];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int result = findLCSTD(arr1, arr2, k, 0, 0, dp);
        System.out.println(result);
    }

    public static int findLCS(int[] arr1, int[] arr2, int K, int i, int j) {
        if (i == arr1.length || j == arr2.length) {
            return 0;
        }
        int pick = 0, notPick = 0;
        if (arr1[i] == arr2[j]) {
            pick = 1 + findLCS(arr1, arr2, K, i + 1, j + 1);
        } else {
            int r1 = 0;
            if (K > 0) {
                r1 = 1 + findLCS(arr1, arr2, K - 1, i + 1, j);
            } else {
                r1 = findLCS(arr1, arr2, K, i + 1, j);
            }
            int r2 = findLCS(arr1, arr2, K, i, j + 1);
            notPick = Math.max(r1, r2);
        }
        return Math.max(pick, notPick);
    }

    public static int findLCSTD(int[] arr1, int[] arr2, int K, int i, int j, int[][] dp) {
        if (i == arr1.length || j == arr2.length) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int pick = 0, notPick = 0;
        if (arr1[i] == arr2[j]) {
            pick = 1 + findLCSTD(arr1, arr2, K, i + 1, j + 1, dp);
        } else {
            int r1 = 0;
            if (K > 0) {
                r1 = 1 + findLCSTD(arr1, arr2, K - 1, i + 1, j, dp);
            } else {
                r1 = findLCSTD(arr1, arr2, K, i + 1, j, dp);
            }
            int r2 = findLCSTD(arr1, arr2, K, i, j + 1, dp);
            notPick = Math.max(r1, r2);
        }
        return dp[i][j] = Math.max(pick, notPick);
    }
}
