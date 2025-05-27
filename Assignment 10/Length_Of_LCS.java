import java.util.Arrays;
import java.util.Scanner;

public class Length_Of_LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int[][] dp = new int[s1.length()][s2.length()];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int result = findLengthLCSBU(s1, s2);
        System.out.println(result);
    }

    private static int findLengthLCSBU(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int pick = 0, notPick = 0;
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    pick = 1 + dp[i - 1][j - 1];
                } else {
                    int r1 = dp[i - 1][j];
                    int r2 = dp[i][j - 1];
                    notPick = Math.max(r1, r2);
                }
                dp[i][j] = pick + notPick;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    private static int findLengthLCSTD(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int pick = 0, notPick = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            pick = 1 + findLengthLCSTD(s1, s2, i + 1, j + 1, dp);
        } else {
            int r1 = findLengthLCSTD(s1, s2, i + 1, j, dp);
            int r2 = findLengthLCSTD(s1, s2, i, j + 1, dp);
            notPick = Math.max(r1, r2);
        }
        return dp[i][j] = pick + notPick;
    }

    private static int findLengthLCS(String s1, String s2, int i, int j) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        int pick = 0, notPick = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            pick = 1 + findLengthLCS(s1, s2, i + 1, j + 1);
        } else {
            int r1 = findLengthLCS(s1, s2, i + 1, j);
            int r2 = findLengthLCS(s1, s2, i, j + 1);
            notPick = Math.max(r1, r2);
        }
        return pick + notPick;
    }
}
