import java.util.*;

public class Unlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong(); // Use long since k can be up to 10^9
        int[] arr = new int[n];
        Map<Integer, Integer> posMap = new HashMap<>();

        // Read the array and store positions
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            posMap.put(arr[i], i);
        }

        int current = 0;
        for (int num = n; num >= 1 && k > 0; num--) {
            int index = posMap.get(num);
            if (index != current) {
                // Swap current and index
                int temp = arr[current];
                arr[current] = arr[index];
                arr[index] = temp;

                // Update positions in the map
                posMap.put(arr[index], index);
                posMap.put(arr[current], current);

                k--; // One swap used
            }
            current++;
        }

        // Print result
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
