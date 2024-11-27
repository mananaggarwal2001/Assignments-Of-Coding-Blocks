import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] barn = new int[N];
        for (int i = 0; i < barn.length; i++) {
            barn[i] = sc.nextInt();
        }
        Arrays.sort(barn);
        int result = findDistance(barn, C);
        System.out.println(result);
    }

    private static int findDistance(int[] barn, int c) {
        int low = 0;
        int high = barn[barn.length - 1] - barn[0];
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isItPossible(mid, c, barn)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    private static boolean isItPossible(int mid, int c, int[] barn) {
        // initial setting for placing the cow.
        int stall = barn[0];
        int cow = 1;
        for (int i = 1; i < barn.length; i++) {
            if (barn[i] - stall >= mid) {
                cow++;
                stall = barn[i];
            }
            if (cow == c) {
                return true;
            }
        }
        return false;
    }
}
