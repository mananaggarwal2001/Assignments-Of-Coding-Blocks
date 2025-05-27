import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Scanner;

public class Minimum_Money_Needed {
    public static int INF = 10000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] oranges = new int[N + 1];
        for (int i = 1; i < oranges.length; i++) {
            oranges[i] = sc.nextInt();
        }

        int result = fillOranges(oranges, W, 1);
        System.out.println(result >= INF ? -1 : result);
    }

    private static int fillOranges(int[] oranges, int w, int index) {
        if (w == 0) {
            return 0;
        }
        if (w < 0 || index >= oranges.length) {
            return INF;
        }
        int pick = INF;
        if (oranges[index] != -1) {
            pick = fillOranges(oranges, w - index, index);
            if (pick != INF) {
                pick += oranges[index];
            }
        }
        int Not_Pick = fillOranges(oranges, w, index + 1);
        return Math.min(pick, Not_Pick);
    }

    private static int fillOrangesTD(int[] oranges, int w, int index, int[][] dp) {
        if (w == 0) {
            return 0;
        }
        if (w < 0 || index >= oranges.length) {
            return INF;
        }
        if (dp[index][w] != -1) {
            return dp[index][w];
        }
        int pick = INF;
        if (oranges[index] != -1) {
            pick = fillOrangesTD(oranges, w - index, index, dp);
            if (pick != INF) {
                pick += oranges[index];
            }
        }
        int Not_Pick = fillOrangesTD(oranges, w, index + 1, dp);
        return dp[index][w] = Math.min(pick, Not_Pick);
    }
}
