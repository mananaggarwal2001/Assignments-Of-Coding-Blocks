import java.util.Scanner;

public class Murthal_Paratha_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parathas = sc.nextInt();
        int number = sc.nextInt();
        int[] cookArray = new int[number];
        for (int i = 0; i < cookArray.length; i++) {
            cookArray[i] = sc.nextInt();
        }
        int result = cookParathas(parathas, cookArray);
        System.out.println(result);
    }

    public static int cookParathas(int parathas, int[] cookArray) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < cookArray.length; i++) {
            if (cookArray[i] > maxValue) {
                maxValue = cookArray[i];
            }
        }
        int low = maxValue;
        int high = maxValue * (parathas * (parathas + 1)) / 2;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isItPossible(mid, parathas, cookArray)) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int mid, int parathas, int[] cookArray) {
        int count = 1;
        int cookedParathas = 0;
        int arrayPointer = 0;
        int sum = 0;
        while (true) {
            if (arrayPointer == cookArray.length) {
                break;
            }
            if (sum + (cookArray[arrayPointer] * count) <= mid) {
                sum += (cookArray[arrayPointer] * count);
                cookedParathas++;
                count++;
            } else {
                arrayPointer++;
                sum = 0;
                count = 1;
            }
        }
        return cookedParathas < parathas;
    }
}