import java.util.Scanner;

public class All_Indices_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] numberArray = new int[number];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        displayIndices(numberArray, 0, target);
    }

    private static void displayIndices(int[] numberArray, int index, int target) {
        if (index > numberArray.length - 1) {
            return;
        }
        if (numberArray[index] == target) {
            System.out.print(index + " ");
        }
        displayIndices(numberArray, index + 1, target);
    }
}
