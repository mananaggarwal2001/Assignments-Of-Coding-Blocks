import java.util.Scanner;

public class Longest_Common_Subseqeuence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int[][][] dp = new int[s1.length()][s2.length()][s3.length()];
        int result = findLCSBU(s1, s2, s3);
        System.out.println(result);
    }

    private static int findLCS(String s1, String s2, String s3, int i, int j, int k) {
        if (i == s1.length() || j == s2.length() || k == s3.length()) {
            return 0;
        }
        int count = 0;
        int notCount = 0;
        if (s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)) {
            count = 1 + findLCS(s1, s2, s3, i + 1, j + 1, k + 1);
        } else {
            int r1 = findLCS(s1, s2, s3, i + 1, j, k);
            int r2 = findLCS(s1, s2, s3, i, j + 1, k);
            int r3 = findLCS(s1, s2, s3, i, j, k + 1);
            notCount = Math.max(r1, Math.max(r2, r3));
        }
        return count + notCount;
    }

    private static int findLCSTD(String s1, String s2, String s3, int i, int j, int k, int[][][] dp) {
        if (i == s1.length() || j == s2.length() || k == s3.length()) {
            return 0;
        }
        if (dp[i][j][k] != 0) {
            return dp[i][j][k];
        }
        int count = 0;
        int notCount = 0;
        if (s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)) {
            count = 1 + findLCSTD(s1, s2, s3, i + 1, j + 1, k + 1, dp);
        } else {
            int r1 = findLCSTD(s1, s2, s3, i + 1, j, k, dp);
            int r2 = findLCSTD(s1, s2, s3, i, j + 1, k, dp);
            int r3 = findLCSTD(s1, s2, s3, i, j, k + 1, dp);
            notCount = Math.max(r1, Math.max(r2, r3));
        }
        return dp[i][j][k] = count + notCount;
    }

    private static int findLCSBU(String s1, String s2, String s3) {
        int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                for (int k = 1; k <= s3.length(); k++) {
                    int count = 0, notCount = 0;
                    if (s1.charAt(i - 1) == s2.charAt(j - 1) && s2.charAt(j - 1) == s3.charAt(k - 1)) {
                        count = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        int r1 = dp[i - 1][j][k];
                        int r2 = dp[i][j - 1][k];
                        int r3 = dp[i][j][k - 1];
                        notCount = Math.max(r1, Math.max(r2, r3));
                    }
                    dp[i][j][k] = count + notCount;
                }
            }
        }
        return dp[s1.length()][s2.length()][s3.length()];
    }
}
