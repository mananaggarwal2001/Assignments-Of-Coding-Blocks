import java.util.*;

public class Top_K_Most_Frequent_Number_In_Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {

            int size = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            printNumbers(arr, k);
            System.out.println();
            testcases--;
        }
    }

    private static void printNumbers(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
                if (a.getValue() != b.getValue()) {
                    return b.getValue() - a.getValue();
                }
                return a.getKey() - b.getKey();
            });
            pq.addAll(map.entrySet());
            if (pq.size() < k) {
                while (!pq.isEmpty()) {
                    System.out.print(pq.poll().getKey() + " ");
                }
            } else {
                for (int j = 0; j < k; j++) {
                    System.out.print(pq.poll().getKey() + " ");
                }
            }
        }
    }
}
