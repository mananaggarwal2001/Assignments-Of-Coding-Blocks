import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recursion_Twins {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = countTwins(str, 0);
        System.out.println(result);
    }

    public static int countTwins(String str, int index) {
        if (index >= str.length()) {
            return 0;
        }
        if (index + 2 < str.length() && str.charAt(index) == str.charAt(index + 2)) {
            return 1 + countTwins(str, index + 1);
        }
        return countTwins(str, index + 1);
    }
}
