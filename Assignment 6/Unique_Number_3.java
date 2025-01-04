import java.util.Scanner;

public class Unique_Number_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int result = findNumber(array);
        System.out.println(result);
    }

    private static int findNumber(int[] array) {
        int ones = 0;
        int two = 0;
        for (int value : array) {
            ones ^= (value & ~(two));
            two ^= (value & ~(ones));
        }
        return ones;
    }
}
