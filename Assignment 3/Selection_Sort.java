import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        sortArray(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    public static void sortArray(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            int minIndex = findMinIndex(numberArray, i);
            int temp = numberArray[i];
            numberArray[i] = numberArray[minIndex];
            numberArray[minIndex] = temp;
        }
    }

    public static int findMinIndex(int[] numberArray, int i) {
        int minIndex = i;
        for (int j = i + 1; j < numberArray.length; j++) {
            if (numberArray[minIndex] > numberArray[j]) {
                minIndex = j;
            }
        }
        return minIndex;
    }
}
