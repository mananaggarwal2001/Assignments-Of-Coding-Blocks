import java.util.*;

public class Merge_K_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long N = sc.nextLong();
        List<List<Long>> lists = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            List<Long> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                long inputValue = sc.nextLong();
                list.add(inputValue);
            }
            lists.add(list);
        }
        List<Long> resultList = findResult(lists);
        for (long finalvalue : resultList) {
            System.out.print(finalvalue + " ");
        }
    }

    private static List<Long> findResult(List<List<Long>> lists) {
        PriorityQueue<List<Long>> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.get(0)));
        for (List<Long> ls : lists) {
            if (!ls.isEmpty()) {
                pq.add(ls);
            }
        }
        List<Long> finallist = new ArrayList<>();
        while (!pq.isEmpty()) {
            List<Long> ls = pq.poll();
            finallist.add(ls.remove(0));
            if (!ls.isEmpty()) {
                pq.add(ls);
            }
        }
        return finallist;
    }
}
