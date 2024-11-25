import java.util.Scanner;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] numberArray = new long[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        productOfArray(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    public static void productOfArray(long[] numberArray) {
        long[] leftArray = new long[numberArray.length];
        leftArray[0] = 1;
        // for finding the product in the left Array
        for (int i = 1; i < numberArray.length; i++) {
            leftArray[i] = leftArray[i - 1] * numberArray[i - 1];
        }
        // for the right Array.
        long[] rightArray = new long[numberArray.length];
        rightArray[rightArray.length - 1] = 1;
        for (int i = numberArray.length - 2; i >= 0; i--) {
            rightArray[i] = rightArray[i + 1] * numberArray[i + 1];
        }
        // for the final Array we will do this thing.
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = leftArray[i] * rightArray[i];
        }
    }
}
