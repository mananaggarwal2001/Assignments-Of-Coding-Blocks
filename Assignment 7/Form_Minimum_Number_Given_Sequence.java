import java.util.Scanner;
import java.util.Stack;

public class Form_Minimum_Number_Given_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] numberStringArray = new String[number];
        for (int i = 0; i < number; i++) {
            String inputString = sc.next();
            numberStringArray[i] = inputString;
        }
        printConvertedStrings(numberStringArray);
    }

    public static void printConvertedStrings(String[] numberStringArray) {
        int count = 1;
        String convertedString;
        for (int i = 0; i < numberStringArray.length; i++) {
            String result = convertString(numberStringArray[i]);
            System.out.println(result);
        }

    }

    public static String convertString(String numberString) {
        Stack<Integer> st = new Stack<>();
        int[] numberArray = new int[numberString.length() + 1];
        int count = 1;
        for (int i = 0; i <= numberString.length(); i++) {
            if (i == numberString.length() || numberString.charAt(i) == 'I') {
                numberArray[i] = count++;
                while (!st.isEmpty()) {
                    numberArray[st.pop()] = count++;
                }
            } else {
                st.push(i);
            }
        }

        String result = "";
        for (int finalanswer : numberArray) {
            result += finalanswer;
        }
        return result;
    }
}
