import java.util.HashMap;
import java.util.Scanner;

public class Exchanging_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        HashMap<Long, Long> dp = new HashMap<>();
        long result = ExchangeTD(number, dp);
        System.out.println(result);

    }
    private static long ExchangeTD(long number, HashMap<Long,Long> dp) {
        if (number == 0) {
            return 0;
        }
        if (dp.containsKey(number)) {
            return dp.get(number);
        }
        long n1 = ExchangeTD(number / 2, dp);
        long n2 = ExchangeTD(number / 3, dp);
        long n3 = ExchangeTD(number / 4, dp);
        long result = Math.max(number, n1 + n2 + n3);
        dp.put(number, result);
        return result;
    }
    private static int Exchange(int number) {
        if (number == 0) {
            return 0;
        }
        int n1 = Exchange(number / 2);
        int n2 = Exchange(number / 3);
        int n3 = Exchange(number / 4);
        return Math.max(number, n1 + n2 + n3);
    }
}