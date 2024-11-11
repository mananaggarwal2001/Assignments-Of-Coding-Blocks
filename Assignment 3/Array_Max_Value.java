import java.util.Scanner;

public class Array_Max_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int maxvalue = findMax(array);
        System.out.println(maxvalue);
    }

    private static int findMax(int[] array) {
        int max_Value = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_Value) {
                max_Value = array[i];
            }
        }
        return max_Value;
    }
}
