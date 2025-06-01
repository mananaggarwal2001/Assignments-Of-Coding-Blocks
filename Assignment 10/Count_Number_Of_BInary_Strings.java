import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Number_Of_BInary_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int number = sc.nextInt();
            long[][] dp = new long[number + 1][2];
            for (long[] arr : dp) {
                Arrays.fill(arr, -1);
            }
            long result = countBinaryStringsTD(number, 0, dp);
            System.out.println(result);
            testCases--;
        }
    }

    private static long countBinaryStrings(int number, String ans) {
        if (number == 0) {
            return 1;
        }
        long result1 = 0;
        if (ans.isEmpty() || ans.charAt(ans.length() - 1) != '1') {
            result1 = countBinaryStrings(number - 1, ans + 1);
        }
        long result2 = countBinaryStrings(number - 1, ans + 0);
        return result2 + result1;
    }

    private static long countBinaryStringsTD(int n, int lastDigit, long[][] dp) {
        if (n == 0) {
            return 1;
        }
        if (dp[n][lastDigit] != -1) {
            return dp[n][lastDigit];
        }
        if (lastDigit == 1) {
            // Only 0 can follow 1
            dp[n][lastDigit] = countBinaryStringsTD(n - 1, 0, dp);
        } else {
            // 0 can be followed by 0 or 1
            dp[n][lastDigit] = countBinaryStringsTD(n - 1, 0, dp) + countBinaryStringsTD(n - 1, 1, dp);
        }

        return dp[n][lastDigit];
    }
}
