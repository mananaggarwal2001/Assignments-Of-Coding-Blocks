import java.util.Scanner;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int findResult = calculate(array);
        System.out.println(findResult);
    }

    private static int calculate(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = array[i];
            // kadan's algorithm is being used for dropping the negative value.
            if (sum < 0) {
                continue;
            }
            int tracker = (i + 1) % array.length;
            while (tracker != i) {
                if (tracker < array.length) {
                    sum += array[tracker];
                    result = Math.max(result, sum);
                }
                // kadan's algorithm
                if (sum < 0) {
                    sum = 0;
                }
                tracker++;
                tracker = tracker % array.length;
            }
        }
        return result;
    }
}
