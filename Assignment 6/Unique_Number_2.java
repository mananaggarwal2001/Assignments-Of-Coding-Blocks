import java.util.Arrays;
import java.util.Scanner;

public class Unique_Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        int[] result = findUniqueNumbers(array);
        Arrays.sort(result);
        for (int ans : result) {
            System.out.print(ans + " ");
        }
    }

    private static int[] findUniqueNumbers(int[] array) {
        int ans = 0;
        for (int value : array) {
            ans ^= value;
        }
        int mask = (ans & (~(ans - 1)));
        int a = 0;
        for (int value : array) {
            if ((value & mask) != 0) {
                a ^= value;
            }
        }
        int b = ans ^ a;
        return new int[]{a, b};
    }
}
