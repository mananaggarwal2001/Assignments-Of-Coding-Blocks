import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mapped_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] numberArray = number.toCharArray();
        Arrays.sort(numberArray);
        String result = "";
        for (char c : numberArray) {
            result += c;
        }
        List<List<String>> finallist = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        answer(result, ll, finallist);
        for (List<String> s : finallist) {
            String ans = "";
            for (String s1 : s) {
                ans += (char) (Long.parseLong(s1) + 64);
            }
            System.out.println(ans);
        }
    }

    private static void answer(String number, List<String> ll, List<List<String>> finallist) {
        if (number.isEmpty()) {
            finallist.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= number.length(); i++) {
            String result = number.substring(0, i);
            if (64 + Long.parseLong(result) >= 65 && 64 + Long.parseLong(result) <= 90) {
                ll.add(result);
                answer(number.substring(i), ll, finallist);
                ll.remove(ll.size() - 1);
            }
        }
    }
}
