import java.util.*;

public class Frequent_Elements_In_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = findTheMaximumNumberOfElements(arr, K);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] findTheMaximumNumberOfElements(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            return b.getValue() - a.getValue();
        });
        pq.addAll(map.entrySet());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(pq.remove().getKey());
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]= list.get(i);
        }
        return ans;
    }
}
