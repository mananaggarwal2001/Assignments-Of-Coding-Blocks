import java.util.Scanner;

public class Vivek_Loves_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int result = vivek_Loves_Game(arr, 0, arr.length - 1);
            System.out.println(result);
        }
    }

    public static int vivek_Loves_Game(int[] arr, int si, int ei) {
        if (si > ei) {
            return 0;
        }
        for (int mid = si; mid < ei; mid++) {
            int sum1 = 0;
            for (int i = si; i <= mid; i++) {
                sum1 += arr[i];
            }
            int sum2 = 0;
            for (int i = mid + 1; i <= ei; i++) {
                sum2 += arr[i];
            }
            if (sum1 == sum2) {
                int left = vivek_Loves_Game(arr, si, mid);
                int right = vivek_Loves_Game(arr, mid + 1, ei);
                return Math.max(left, right) + 1;
            }
        }
        return 0;
    }
}
