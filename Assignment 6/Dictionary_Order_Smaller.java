import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary_Order_Smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        ArrayList<String> list = new ArrayList<>();
        displayPermutations(input, input, list, "");
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void displayPermutations(String input, String check, ArrayList<String> list, String ans) {
        if (input.isEmpty()) {
            if (check.compareTo(ans) > 0) {
                list.add(ans);
            }
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String s1 = input.substring(0, i);
            String s2 = input.substring(i + 1);
            displayPermutations(s1 + s2, check, list, ans + ch);
        }
    }
}
