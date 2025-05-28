import java.util.*;

public class Longest_Increasing_Subsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // NLogN technique I use in LIS.
        int result = Lis(arr);
        System.out.println(result);
    }

    public static int Lis(int[] arr) {
        int[] lis = new int[arr.length];
        lis[0] = arr[0];
        int length = 1;
        for (int i = 1; i < arr.length; i++) {
            if (lis[length - 1] < arr[i]) {
                lis[length] = arr[i];
                length++;
            } else {
                int idx = binarysearch(lis, 0, length - 1, arr[i]);
                lis[idx] = arr[i];
            }
        }
        return length;
    }

    public static int binarysearch(int[] arr, int si, int ei, int item) {
        int ans = 0;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] >= item) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }
}