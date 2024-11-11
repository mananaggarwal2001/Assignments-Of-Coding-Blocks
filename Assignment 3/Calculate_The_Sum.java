import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] numberArray = new long[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextLong();
        }
        int query = sc.nextInt();
        while (query > 0) {
            int position = sc.nextInt();
            changeArrayCalculate(position, numberArray);
            query--;
        }
        long sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        long finalresult = (long) (sum % (Math.pow(10, 9) + 7));
        System.out.println(finalresult);
    }

    private static void changeArrayCalculate(int position, long[] numberArray) {
        long[] outputArray = new long[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            if (i - position < 0) {
                outputArray[i] = numberArray[i] + numberArray[numberArray.length + i - position];
            } else {
                outputArray[i] = numberArray[i] + numberArray[i - position];
            }
        }
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = outputArray[i];
        }
    }
}
