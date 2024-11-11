import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int targetValue = sc.nextInt();
        Arrays.sort(array);
        printTriplets(array, targetValue);
    }

    public static void printTriplets(int[] array, int targetValue) {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == targetValue) {
                        System.out.println(array[i] + ", " + array[j] + " and " + array[k]);
                    }
                }
            }
        }
    }
}
