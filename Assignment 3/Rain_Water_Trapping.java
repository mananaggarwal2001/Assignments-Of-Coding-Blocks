import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int size = sc.nextInt();
            int[] numberArray = new int[size];
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = sc.nextInt();
            }
            int result = rainwaterTrapping(numberArray);
            System.out.println(result);
            test--;
        }

    }

    public static int rainwaterTrapping(int[] numberArray) {
        // for finding the maximum value from the left hand side.
        int[] leftArray = new int[numberArray.length];
        leftArray[0] = numberArray[0];
        for (int i = 1; i < numberArray.length; i++) {
            leftArray[i] = Math.max(leftArray[i - 1], numberArray[i]);
        }
        int[] rightArray = new int[numberArray.length];
        rightArray[rightArray.length - 1] = numberArray[numberArray.length - 1];
        for (int i = rightArray.length - 2; i >= 0; i--) {
            rightArray[i] = Math.max(rightArray[i + 1], numberArray[i]);
        }
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += (Math.min(leftArray[i], rightArray[i]) - numberArray[i]);
        }
        return sum;
    }
}
