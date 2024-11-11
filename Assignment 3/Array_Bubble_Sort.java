import java.util.Scanner;

public class Array_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] numberArray = new long[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextLong();
        }
        bubble_Sort(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    private static void bubble_Sort(long[] numberArray) {
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = 0; j < numberArray.length - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    long temp = numberArray[j + 1];
                    numberArray[j + 1] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
    }
}
