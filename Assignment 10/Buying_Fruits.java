import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Buying_Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int fruitSellers = sc.nextInt();
            long[][] fruits = new long[fruitSellers][3];
            for (int i = 0; i < fruitSellers; i++) {
                for (int j = 0; j < fruits[0].length; j++) {
                    fruits[i][j] = sc.nextLong();
                }
            }
            Map<String, Long> dp = new HashMap<>();
            System.out.println(buyFruitsTD(fruits, 0, -1, dp));
            testcases--;
        }
    }

    public static long buyFruits(long[][] arr, int index, int previousFruitBuyed) {
        if (index == arr.length) {
            return 0;
        }
        long[] fruitsArray = arr[index];
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < fruitsArray.length; i++) {
            if (i != previousFruitBuyed) {
                long result = fruitsArray[i] + buyFruits(arr, index + 1, i);
                ans = Math.min(ans, result);
            }
        }
        return ans;
    }

    public static long buyFruitsTD(long[][] arr, int index, int previousFruitBuyed, Map<String, Long> map) {
        if (index == arr.length) {
            return 0;
        }
        String key = index + "," + previousFruitBuyed + 1;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        long[] fruitsArray = arr[index];
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < fruitsArray.length; i++) {
            if (i != previousFruitBuyed) {
                long result = fruitsArray[i] + buyFruitsTD(arr, index + 1, i, map);
                ans = Math.min(ans, result);
            }
        }
        map.put(key, ans);
        return ans;
    }

    public static long buyFruitsBU(long[][] fruits) {
        long[][] dp = new long[fruits.length][fruits[0].length];
        for (int i = 0; i < fruits[0].length; i++) {
            dp[0][i] = fruits[0][i];
        }
        for (int i = 1; i < fruits.length; i++) {
            for (int j = 0; j < fruits[0].length; j++) {
                long answer = fruits[i][j] + Math.min(
                        dp[i - 1][(j + 1) % 3],
                        dp[i - 1][(j + 2) % 3]
                );
                dp[i][j] = answer;
            }
        }
        return Math.min(dp[dp.length - 1][dp[0].length - 1],
                Math.min(dp[dp.length - 1][dp[0].length - 2],
                        dp[dp.length - 1][dp[0].length - 3]
                ));
    }

}
