import java.util.Scanner;

public class Kth_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long result = checkNumber(n, k);
            System.out.println(result);
            t--;
        }
    }

    private static long checkNumber(long n, long k) {
        long low = 1;
        long high = n;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (Math.pow(mid, k) > n) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }
        return high;
    }
}
