import java.util.Arrays;
import java.util.Scanner;

public class Pyush_Nimit_Game {
    // this question is of optimal game strategy.
    // In this game we have to do the best but expect the worst from the opponent.
    // Isme humko apna best score lena hain but hume expect worst result hi karna hain.
    // Aur jab hum apna best score choose kar chuke honge to hume min hi expect karna hain agle turn me because humara opponent bhi Maximum value hi choose karne ki koshish karega.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[size][size];
        for (int[] result : dp) {
            Arrays.fill(result, -1);
        }
        int result = findMaxNumberPyushTD(arr, 0, arr.length - 1, dp);
        System.out.println(result);
    }

    private static int findMaxNumberPyush(int[] arr, int i, int j) {
        if (i > j) {
            return 0;
        }
        int take_i = arr[i] + Math.min(findMaxNumberPyush(arr, i + 2, j), findMaxNumberPyush(arr, i + 1, j - 1));
        int take_j = arr[j] + Math.min(findMaxNumberPyush(arr, i + 1, j - 1), findMaxNumberPyush(arr, i, j - 2));
        return Math.max(take_i, take_j);
    }

    private static int findMaxNumberPyushTD(int[] arr, int i, int j, int[][] dp) {
        if (i > j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int take_i = arr[i] + Math.min(findMaxNumberPyushTD(arr, i + 2, j, dp), findMaxNumberPyushTD(arr, i + 1, j - 1, dp));
        int take_j = arr[j] + Math.min(findMaxNumberPyushTD(arr, i + 1, j - 1, dp), findMaxNumberPyushTD(arr, i, j - 2, dp));
        return dp[i][j] = Math.max(take_i, take_j);
    }
}
