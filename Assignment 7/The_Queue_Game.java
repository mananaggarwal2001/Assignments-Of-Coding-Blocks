import java.util.Scanner;

public class The_Queue_Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int number = sc.nextInt();
            int[] numberArray = new int[number];
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = sc.nextInt();
            }
            String value = isValidOrNot(numberArray);
            System.out.println(value);

            testCases--;
        }
    }

    public static String isValidOrNot(int[] numberArray) {
        int count = 0;
        for (int value : numberArray) {
            if (value == 0) {
                count--;
                if (count < 0) {
                    return "Invalid";
                }
            } else {
                count++;
            }
        }
        return "Valid";
    }
}
