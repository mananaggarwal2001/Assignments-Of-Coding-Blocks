import java.util.Scanner;

public class Playing_With_Good_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goodString = sc.next();
        int result = checkLength(goodString);
        System.out.println(result);
    }

    public static int checkLength(String goodString) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < goodString.length(); i++) {
            if (goodString.charAt(i) == 'a'
                    || goodString.charAt(i) == 'e'
                    || goodString.charAt(i) == 'i'
                    || goodString.charAt(i) == 'o'
                    || goodString.charAt(i) == 'u') {
                sum++;
            } else {
                result = Math.max(sum, result);
                sum = 0;
            }
        }
        result = Math.max(sum, result);
        return result;
    }
}
