import java.util.Scanner;

public class Array_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long[] numberArray = new long[number];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        int targetValue = sc.nextInt();
        int foundElement = linearSearch(numberArray, targetValue);
        System.out.println(foundElement);
    }

    public static int linearSearch(long[] numberArray, int targetValue) {
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }
}
