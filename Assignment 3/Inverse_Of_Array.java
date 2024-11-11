import java.util.Scanner;

public class Inverse_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        int[] resultArray = new int[size];
        changeArray(numberArray, resultArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    public static void changeArray(int[] numberArray, int[] resultArray) {
        int count = 0;
        for (int i = 0; i < numberArray.length; i++) {
            resultArray[numberArray[i]] = count;
            count++;
        }
    }
}
