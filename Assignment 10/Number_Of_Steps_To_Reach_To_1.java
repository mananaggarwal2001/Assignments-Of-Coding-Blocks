import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number_Of_Steps_To_Reach_To_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Map<Integer, Integer> dp = new HashMap<>();
        int result = countOperationsTD(number, dp);
        System.out.println(result);
    }

    private static int countOperations(int number) {
        if (number == 1) {
            return 1;
        }
        if (number <= 0) {
            return 0;
        }
        int even = Integer.MAX_VALUE, odd = Integer.MAX_VALUE;
        if ((number & 1) == 0) {
            even = 1 + countOperations(number / 2);
        } else {
            int r1 = 1 + countOperations(number - 1);
            int r2 = 1 + countOperations(number + 1);
            odd = Math.min(r1, r2);
        }
        return Math.min(even, odd);
    }

    private static int countOperationsTD(int number, Map<Integer, Integer> dp) {
        if (number == 1) {
            return 1;
        }
        if (number <= 0) {
            return 0;
        }
        if (dp.containsKey(number)) {
            return dp.get(number);
        }
        int even = Integer.MAX_VALUE, odd = Integer.MAX_VALUE;
        if ((number & 1) == 0) {
            even = 1 + countOperationsTD(number / 2, dp);
        } else {
            int r1 = 1 + countOperationsTD(number - 1, dp);
            int r2 = 1 + countOperationsTD(number + 1, dp);
            odd = Math.min(r1, r2);
        }
        int ans = Math.min(even, odd);
        dp.put(number, ans);
        return ans;
    }
}
