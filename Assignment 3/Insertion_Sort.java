import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            InsertMaxElement(array, i);
        }
    }

    private static void InsertMaxElement(int[] array, int i) {
        int element = array[i];
        int position = i;
        for (int j = i - 1; j >= 0; j--) {
            if (array[j] > element) {
                array[j + 1] = array[j];
                position = j;
            }
        }
        array[position] = element;
    }
}
