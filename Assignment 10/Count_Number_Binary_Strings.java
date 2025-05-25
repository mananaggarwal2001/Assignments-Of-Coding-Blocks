import java.util.Arrays;
import java.util.Scanner;

public class Count_Number_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int lengthOfString = sc.nextInt();
            long[] dp = new long[lengthOfString + 1];
            Arrays.fill(dp, -1);
            long result = countLengthOfStringTD("", lengthOfString, dp);
            System.out.println(result);
            testCases--;
        }
    }

    private static long countLengthOfString(String ans, int lengthOfString) {
        if (lengthOfString == 0) {
            return 1;
        }
        long oneString = 0;
        if (ans.isEmpty() || ans.charAt(ans.length() - 1) != '1') {
            oneString = countLengthOfString(ans + "1", lengthOfString - 1);
        }
        long zeroString = countLengthOfString(ans + "0", lengthOfString - 1);
        return oneString + zeroString;
    }

    private static long countLengthOfStringTD(String ans, int lengthOfString, long[] dp) {
        if (lengthOfString == 0) {
            return 1;
        }
        long oneString = 0;
        if (dp[lengthOfString] != -1) {
            return dp[lengthOfString];
        }
        if (ans.isEmpty() || ans.charAt(ans.length() - 1) != '1') {
            oneString = countLengthOfStringTD(ans + "1", lengthOfString - 1, dp);
        }
        long zeroString = countLengthOfStringTD(ans + "0", lengthOfString - 1, dp);
        return dp[lengthOfString] = oneString + zeroString;
    }
}
