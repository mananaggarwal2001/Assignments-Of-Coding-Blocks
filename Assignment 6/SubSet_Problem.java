import java.util.Scanner;

public class SubSet_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = countSubsets(arr, target, 0, 0, "");
        String resultString = "";
        String findedString = combinedSubsets(arr, target, 0, 0, "");
        System.out.println(findedString.trim());
        System.out.println(result);
    }

    private static String combinedSubsets(int[] arr, int target, int tracker, int index, String ans) {
        if (index > arr.length - 1) {
            return "";
        }
        if (tracker > target) {
            return "";
        }
        if (tracker == target) {
            return ans.trim() + "  ";
        }
        String finalString = "";
        for (int i = index; i < arr.length; i++) {
            finalString += combinedSubsets(arr, target, tracker + arr[i], index + 1, ans + arr[i] + " ");
        }
        return finalString;
    }

    private static int countSubsets(int[] arr, int target, int tracker, int index, String ans) {
        if (index > arr.length - 1 || tracker > target) {
            return 0;
        }
        if (target == tracker) {
            return 1;
        }
        int sum = 0;
        for (int i = index; i < arr.length; i++) {
            sum += countSubsets(arr, target, tracker + arr[i], index + 1, ans + arr[i] + " ");
        }
        return sum;
    }
}