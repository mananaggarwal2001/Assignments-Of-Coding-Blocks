import java.util.Scanner;

public class Running_Sum_Of_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        runningSum(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }
    public static void runningSum(int[] numberArray) {
        for (int i = 1; i < numberArray.length; i++) {
            numberArray[i] = numberArray[i] + numberArray[i - 1];
        }
    }
}
