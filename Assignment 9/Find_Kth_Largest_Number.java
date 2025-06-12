import java.util.PriorityQueue;
import java.util.Scanner;

public class Find_Kth_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findKthLargestNumber(arr, k);
        System.out.println(result);
    }

    private static int findKthLargestNumber(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            int outPutNumber = pq.peek();
            if (outPutNumber < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.remove();
    }
}
