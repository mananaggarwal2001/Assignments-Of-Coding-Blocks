import java.util.Scanner;

public class Sorting_In_Linear_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        sortArray(numberArray);
        for (int number : numberArray) {
            System.out.print(number + " ");
        }
    }

    public static void sortArray(int[] numberArray) {
        int[] manualArray = new int[3];
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
