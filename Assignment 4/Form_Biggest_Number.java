import java.util.Arrays;
import java.util.Scanner;

public class Form_Biggest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int size = sc.nextInt();
            int[] numberArray = new int[size];
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] = sc.nextInt();
            }
            String result = formLargestString(numberArray);
            System.out.println(result);
            test--;
        }
    }

    public static String formLargestString(int[] numberArray) {
        String[] arrays = new String[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            arrays[i] = String.valueOf(numberArray[i]);
        }
        Arrays.sort(arrays, (s1, s2) -> myCompare(s1, s2) ? -1 : 1);
        String formedString = "";
        for (int i = 0; i < arrays.length; i++) {
            formedString += arrays[i];
        }
        return formedString;
    }

    public static boolean myCompare(String s1, String s2) {
        return (s1 + s2).compareTo(s2 + s1) > 0;
    }
}
