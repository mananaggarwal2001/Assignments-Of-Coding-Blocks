import java.util.Scanner;

public class Sort_Just_0_And_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        sortedArrayJust0and1(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    private static void sortedArrayJust0and1(int[] numberArray) {
        int[] manualArray = new int[2];
        for (int i = 0; i < numberArray.length; i++) {
            manualArray[numberArray[i]]++;
        }
        int manualPointer = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (manualArray[manualPointer] == 0) {
                manualPointer++;
            }
            numberArray[i] = manualPointer;
            manualArray[manualPointer]--;
        }
    }
}
