import java.util.*;
public class Climbing_Stairs {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int[] dp= new int[number+1];
        Arrays.fill(dp, -1);
        int result= minStepsTD(number, dp);
        System.out.println(result);
    }

    public static int minStepsTD(int number, int[] dp) {
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return 0; // to avoid invalid paths
        }
        if (dp[number] != -1) {
            return dp[number];
        }
        int step1 = minStepsTD(number - 1, dp);
        int step2 = minStepsTD(number - 2, dp);
        return dp[number]= step1+step2;
    }
}