import java.util.Scanner;

public class How_Many_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int result = 0;
        while (testCases > 0) {
            int[] numberArray = new int[3];
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = sc.nextInt();
            }
            boolean checkValid = check(numberArray);
            if (checkValid) {
                result++;
            }
            testCases--;
        }
        System.out.println(result);
    }

    private static boolean check(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 1) {
                sum++;
            }
        }
        return sum >= 2;
    }
}
