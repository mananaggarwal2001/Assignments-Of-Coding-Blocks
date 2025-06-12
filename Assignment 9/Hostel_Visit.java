import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hostel_Visit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (N > 0) {
            long queryType = sc.nextLong();
            if (queryType == 1) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                long distanceSquared = (long) (Math.pow(x, 2) + Math.pow(y, 2));
                if (pq.size() < K) {
                    pq.add(distanceSquared);
                } else {
                    pq.poll();
                    pq.add(distanceSquared);
                }
            } else if (queryType == 2) {
                System.out.println(pq.peek());
            }
            N--;
        }
    }
}
