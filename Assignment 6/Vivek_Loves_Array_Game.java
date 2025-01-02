import java.util.Scanner;

public class Vivek_Loves_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            int[] numberArray = new int[size];
            int sum = 0;
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = sc.nextInt();
                sum += numberArray[i];
            }
            if (sum % 2 != 0) {
                System.out.println(0);
                return;
            }
            int result = checkMaxNumber(numberArray, 0, numberArray.length - 1, 0);
            System.out.println(result);
            testCases--;
        }
    }

    private static int checkMaxNumber(int[] numberArray, int si, int ei, int index) {
        // target 1 is getting the sum of the array.
        // base case 1.
        if (index >= numberArray.length) {
            return 0;
        }
        int sum1 = getSum(numberArray, si, index);
        int sum2 = getSum(numberArray, index + 1, ei);
        int result = 0;
        if (sum1 == sum2) {
            int count1 = 1 + checkMaxNumber(numberArray, si, index, index + 1);
            int count2 = 1 + checkMaxNumber(numberArray, index + 1, ei, index + 1);
            result += Math.max(count1, count2);
        } else {
            return checkMaxNumber(numberArray, si, ei, index + 1);
        }
        return result;
    }

    private static int getSum(int[] numberArray, int si, int ei) {
        int sum = 0;
        for (int i = si; i <= ei; i++) {
            sum += numberArray[i];
        }
        return sum;
    }
}
