import java.util.Scanner;
import java.util.Stack;

public class Kartik_Bhaiyaa_And_Celebrity_Problem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] numberMatrix = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                numberMatrix[i][j] = sc.nextInt();
            }
        }
        int result = calculateCelebrity(numberMatrix);
        if (result == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println(result);
        }
    }

    public static int calculateCelebrity(int[][] numberMatrix) {
        Stack<Integer> numberStack = new Stack<>();
        for (int i = 0; i < numberMatrix.length; i++) {
            numberStack.push(i); // contenstants
        }
        while (numberStack.size() > 1) {
            int contestant1 = numberStack.pop();
            int contestant2 = numberStack.pop();
            if (numberMatrix[contestant1][contestant2] == 1) {
                numberStack.push(contestant2);
            } else {
                numberStack.push(contestant1);
            }
        }
        // if 2 knows somebody or not.
        int member = numberStack.pop();
        for (int i = 0; i < numberMatrix[member].length; i++) {
            if (numberMatrix[member][i] == 1) {
                return -1;
            }
        }
        return member;
    }

}
