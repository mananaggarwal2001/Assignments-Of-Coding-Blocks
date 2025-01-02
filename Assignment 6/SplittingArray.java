import java.util.Scanner;

public class SplittingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        splitArray(arr, 0, arr.length - 1);
    }

    private static void splitArray(int[] arr, int start, int end) {
        
    }
}
