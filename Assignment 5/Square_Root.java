import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long result = findSQRT(number);
        System.out.println(result);
    }

    private static long findSQRT(long number) {
        long low = 0;
        long high = number;
        long result = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= number) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
