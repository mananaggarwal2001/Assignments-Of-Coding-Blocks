import java.util.Arrays;
import java.util.Scanner;

public class Plate_Dropping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int numberOfPlates = sc.nextInt();
            int numberOfFloors = sc.nextInt();
            int[][] dp = new int[numberOfPlates + 1][numberOfFloors + 1];
            for (int[] arr : dp) {
                Arrays.fill(arr, -1);
            }
            int result = checkMinimumNumberOfTrialsTD(numberOfPlates, numberOfFloors, dp);
            System.out.println(result);
            for (int[] row : dp) {
                System.out.println(Arrays.toString(row));
            }
            testCases--;
        }
    }

    private static int checkMinimumNumberOfTrials(int numberOfPlates, int numberOfFloors) {
        if (numberOfPlates == 1) {
            return numberOfFloors; // isme hum ye assume karenge ki threshold floor jo milega wo sabse top wala floor hi milega.
        }
        if (numberOfFloors == 1 || numberOfFloors == 0) {
            return numberOfFloors; // iss base case me jitne floors bache hain utne hi number attempt rahenge ki kitne attemps lagenge.
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= numberOfFloors; i++) {
            int eggWillBreak = checkMinimumNumberOfTrials(numberOfPlates - 1, i - 1);
            int eggWillNotBreak = checkMinimumNumberOfTrials(numberOfPlates, numberOfFloors - i);
            int finalValue = 1 + Math.max(eggWillBreak, eggWillNotBreak); // we are finding the worst case then we are minimizing the worst case basically.
            ans = Math.min(ans, finalValue);
        }
        return ans;
    }

    private static int checkMinimumNumberOfTrialsTD(int numberOfPlates, int numberOfFloors, int[][] dp) {
        if (numberOfPlates == 1) {
            return numberOfFloors; // isme hum ye assume karenge ki threshold floor jo milega wo sabse top wala floor hi milega.
        }
        if (numberOfFloors == 1 || numberOfFloors == 0) {
            return numberOfFloors; // iss base case me jitne floors bache hain utne hi number attempt rahenge ki kitne attemps lagenge.
        }
        if (dp[numberOfPlates][numberOfFloors] != -1) {
            return dp[numberOfPlates][numberOfFloors];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= numberOfFloors; i++) {
            int eggWillBreak = checkMinimumNumberOfTrialsTD(numberOfPlates - 1, i - 1, dp);
            int eggWillNotBreak = checkMinimumNumberOfTrialsTD(numberOfPlates, numberOfFloors - i, dp);
            int finalValue = 1 + Math.max(eggWillBreak, eggWillNotBreak); // we are finding the worst case then we are minimizing the worst case basically.
            ans = Math.min(ans, finalValue);
        }
        return dp[numberOfPlates][numberOfFloors] = ans;
    }

    private static int checkMinimumNumberOfTrialsBU(int numberOfPlates, int numberOfFloors) {
        int[][] dp = new int[numberOfPlates + 1][numberOfFloors + 1];
        return 0;
    }
}
