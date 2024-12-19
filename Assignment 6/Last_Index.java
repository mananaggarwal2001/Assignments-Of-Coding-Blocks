import java.util.Scanner;

public class Last_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = findIndex(arr, target, arr.length - 1);
        System.out.println(result);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index - 1);
    }
}
