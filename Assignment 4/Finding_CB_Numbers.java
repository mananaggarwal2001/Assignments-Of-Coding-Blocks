import java.util.Scanner;

public class Finding_CB_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String s = sc.next();
        int result = findCBNumbers(s);
        System.out.println(result);
    }

    public static int findCBNumbers(String s) {
        int count = 0;
        boolean[] checkVisited = new boolean[s.length()];
        // find the subStrings length wise then we will do the further procedure.
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String subString = s.substring(i, j);
                if (isCBNumberOrNot(Long.parseLong(subString)) && isVisited(checkVisited, i, j - 1)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        checkVisited[k] = true;
                    }
                }
            }
        }

        return count;
    }

    public static boolean isVisited(boolean[] checkVisited, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (checkVisited[i]) {
                return false;
            }
        }
        return true;
    }


    public static boolean isCBNumberOrNot(long number) {
        if (number == 0 || number == 1) {
            return false;
        }
        long[] cbNumbersArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < cbNumbersArray.length; i++) {
            if (cbNumbersArray[i] == number) {
                return true;
            }
        }
        for (int i = 0; i < cbNumbersArray.length; i++) {
            if (number % cbNumbersArray[i] == 0) {
                return false;
            }
        }
        return true;
    }
}