import java.util.Arrays;
import java.util.Scanner;

public class Valentine_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberBoys = sc.nextInt();
        int numberGirls = sc.nextInt();
        int[] boys = new int[numberBoys];
        int[] girls = new int[numberGirls];
        for (int i = 0; i < boys.length; i++) {
            boys[i] = sc.nextInt();
        }
        for (int i = 0; i < girls.length; i++) {
            girls[i] = sc.nextInt();
        }
        Arrays.sort(boys);
        Arrays.sort(girls);
        int[][] dp = new int[boys.length][girls.length];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int result = valentineMagicBU(boys, girls);
        System.out.println(result);
    }

    private static int valentineMagicBU(int[] boys, int[] girls) {
        int[][] dp = new int[boys.length + 1][girls.length + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = (int) Math.pow(10, 7);
        }
        for (int i = 1; i <= boys.length; i++) {
            for (int j = 1; j <= girls.length; j++) {
                int pick = Math.abs(boys[i - 1] - girls[j - 1]) + dp[i - 1][j - 1];
                int notPick = dp[i][j - 1];
                dp[i][j] = Math.min(pick, notPick);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    private static int valentineMagicTD(int[] boys, int[] girls, int i, int j, int[][] dp) {
        if (i == boys.length) {
            return 0;
        }
        if (j == girls.length) {
            return (int) Math.pow(10, 7);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int pick = Math.abs(boys[i] - girls[j]) + valentineMagicTD(boys, girls, i + 1, j + 1, dp);
        int Not_Pick = valentineMagicTD(boys, girls, i, j + 1, dp);
        return dp[i][j] = Math.min(pick, Not_Pick);
    }

    private static int valentineMagic(int[] boys, int[] girls, int i, int j) {
        if (i == boys.length) {
            return 0;
        }
        if (j == girls.length) {
            return (int) Math.pow(10, 7);
        }
        int pick = Math.abs(boys[i] - girls[j]) + valentineMagic(boys, girls, i + 1, j + 1);
        int Not_Pick = valentineMagic(boys, girls, i, j + 1);
        return Math.min(pick, Not_Pick);
    }
}
