import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] numberArray = new long[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        long targetValue = sc.nextLong();
        Arrays.sort(numberArray);
        printTargetValues(numberArray, targetValue);
    }

    private static void printTargetValues(long[] numberArray, long targetValue) {
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] + numberArray[j] == targetValue) {
                    System.out.println(numberArray[i] + " and " + numberArray[j]);
                }
            }
        }
    }
}
