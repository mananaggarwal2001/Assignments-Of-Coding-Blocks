import java.util.Scanner;
import java.util.Stack;

public class Greater_Element_In_Circular_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] numberArray = new int[number];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        int[] result = findNextGreater(numberArray);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] findNextGreater(int[] numberArray) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            while (!st.isEmpty() && numberArray[i] > numberArray[st.peek()]) {
                ans[st.pop()] = numberArray[i];
            }

            st.push(i);
        }
        while (!st.isEmpty()) {
            if (numberArray[0] > numberArray[st.peek()]) {
                ans[st.pop()] = numberArray[0];
            } else {
                ans[st.pop()] = -1;
            }
        }
        return ans;
    }
}
