import java.util.PriorityQueue;
import java.util.Scanner;

public class String_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.startsWith(b) || b.startsWith(a)) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
        while (queries > 0) {
            String inputString = sc.next();
            pq.add(inputString);
            queries--;
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
