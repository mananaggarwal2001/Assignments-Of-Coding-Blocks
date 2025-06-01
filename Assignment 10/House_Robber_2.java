import java.util.*;

public class House_Robber_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[size];
        Arrays.fill(dp, -1);
        int result1 = houseRobber2TD(arr, 0, arr.length - 2, dp);
        Arrays.fill(dp, -1);
        int result2 = houseRobber2TD(arr, 1, arr.length - 1, dp);
        System.out.println(Math.max(result1, result2));
    }

    public static int houseRobber2TD(int[] arr, int index, int endingPoint, int[] dp) {
        if (index > endingPoint) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int rob = arr[index] + houseRobber2TD(arr, index + 2, endingPoint, dp);
        int dont_rob = houseRobber2TD(arr, index + 1, endingPoint, dp);
        return dp[index] = Math.max(rob, dont_rob);
    }
}