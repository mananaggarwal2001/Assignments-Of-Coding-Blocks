import java.util.Scanner;

public class Smart_Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int result = robTheHousesBU(arr);
            System.out.println(result);
            testCases--;
        }
    }

    private static int robTheHouses(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        int rob = arr[i] + robTheHouses(arr, i + 2);
        int dont_rob = robTheHouses(arr, i + 1);
        return Math.max(rob, dont_rob);
    }

    private static int robTheHousesTD(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + robTheHousesTD(arr, i + 2, dp);
        int dont_rob = robTheHousesTD(arr, i + 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }

    private static int robTheHousesBU(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int rob = arr[i] + dp[i - 2];
            int dont_Rob = dp[i - 1];
            dp[i] = Math.max(rob, dont_Rob);
        }
        return dp[dp.length - 1];
    }
}
