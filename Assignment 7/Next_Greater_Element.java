import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] numberArray = new int[number];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        int[] result = nextGreaterElement(numberArray);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] nextGreaterElement(int[] numberArray) {
        int[] ans = new int[numberArray.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < numberArray.length; i++) {
            while (!st.isEmpty() && numberArray[i] > numberArray[st.peek()]) {
                ans[st.pop()] = numberArray[i];
            }

            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;
    }
}
