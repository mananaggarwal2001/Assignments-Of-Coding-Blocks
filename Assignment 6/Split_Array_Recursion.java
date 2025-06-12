import java.util.Scanner;

public class Split_Array_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = split_Array(arr, 0, 0, "", 0, "");
        System.out.println(result);
    }

    public static int split_Array(int[] arr, int idx, int sum1, String ans1, int sum2, String ans2) {
        if (idx == arr.length) {
            if (sum1 == sum2) {
                System.out.println(ans1 + "and " + ans2);
                return 1;
            } else {
                return 0;
            }
        }
        int result1 = split_Array(arr, idx + 1, sum1 + arr[idx], ans1 + arr[idx] + " ", sum2, ans2);
        int result2 = split_Array(arr, idx + 1, sum1, ans1, sum2 + arr[idx], ans2 + arr[idx] + " ");
        return result2 + result1;
    }
}
