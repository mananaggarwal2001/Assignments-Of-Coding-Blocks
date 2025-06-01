import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_Frequency_Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
        }
        long findNumber = findTheHighestFreqNumber(arr);
        System.out.println(findNumber);
    }

    private static long findTheHighestFreqNumber(long[] arr) {
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0L) + 1L);
        }
        long result = Long.MIN_VALUE;
        long value = Long.MIN_VALUE;
        for (long key : map.keySet()) {
            if (value < map.get(key)) {
                result = key;
                value = map.get(key);
            }
        }
        return result;
    }
}
