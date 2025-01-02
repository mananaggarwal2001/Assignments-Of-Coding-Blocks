import java.util.Scanner;

// this question is for backtracking.
public class Split_Array_Recursion {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        boolean[] isPicked = new boolean[number];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            System.out.println(0);
            return;
        }
        sum /= 2;
        permuteArray(arr, sum, isPicked, 0);
        System.out.println(count);
        count = 0;
    }

    private static void permuteArray(int[] arr, int sum, boolean[] isPicked, int index) {
        if (index == arr.length) {
            int splitSum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (isPicked[i]) {
                    splitSum += arr[i];
                }
            }
            if (splitSum == sum) {
                for (int i = 0; i < arr.length; i++) {
                    if (isPicked[i]) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.print("and ");
                for (int i = 0; i < arr.length; i++) {
                    if (!isPicked[i]) {
                        System.out.print(arr[i] + " ");
                    }
                }
                count++;
                System.out.println();
            }
            return;
        }
        isPicked[index] = true;
        permuteArray(arr, sum, isPicked, index + 1);
        isPicked[index] = false;
        permuteArray(arr, sum, isPicked, index + 1);
    }
}
