import java.util.Scanner;

public class Von_Newman_Loves_Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numberArray = new int[N];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        decimalconversion(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }

    public static void decimalconversion(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            int binaryNumber = numberArray[i];
            int result = computevalue(binaryNumber);
            numberArray[i] = result;
        }
    }

    public static int computevalue(int binaryNumber) {
        String numberString = String.valueOf(binaryNumber);
        int sum = 0;
        int power = 0;
        for (int i = numberString.length() - 1; i >= 0; i--) {
            if (numberString.charAt(i) - '0' == 1) {
                sum += (int) Math.pow(2, power);
            }
            power++;
        }
        return sum;
    }
}