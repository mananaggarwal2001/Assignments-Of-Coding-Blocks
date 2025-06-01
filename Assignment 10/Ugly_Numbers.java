import java.util.*;

public class Ugly_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            long input = sc.nextLong();
            long result = findNumber(input);
            System.out.println(result);
            testCases--;
        }
    }

    public static long findNumber(long index) {
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        while (index - 1 > 0) {
            long value = set.first();
            set.remove(value);
            set.add(value * 2);
            set.add(value * 3);
            set.add(value * 5);
            index--;
        }
        return set.first();
    }
}