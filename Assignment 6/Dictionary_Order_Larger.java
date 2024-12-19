import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        ArrayList<String> printList = new ArrayList<>();
        checkPermute(inputString, inputString, "", printList);
        Collections.sort(printList);
        for (String s : printList) {
            System.out.println(s);
        }
    }

    private static void checkPermute(String inputString, String check, String ans, ArrayList<String> printList) {
        if (inputString.isEmpty()) {
            if (check.compareTo(ans) < 0) {
                printList.add(ans);
            }
        }
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            String s1 = inputString.substring(0, i);
            String s2 = inputString.substring(i + 1);
            checkPermute(s1 + s2, check, ans + ch, printList);
        }
    }
}
