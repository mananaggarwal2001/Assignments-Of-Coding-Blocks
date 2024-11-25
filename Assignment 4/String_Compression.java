import java.util.ArrayList;
import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        stringCompress(s);
    }

    public static void stringCompress(String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 1;
        char variable = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (variable != s.charAt(i)) {
                String combinedString = String.valueOf(variable) + count;
                arrayList.add(combinedString);
                variable = s.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        arrayList.add(String.valueOf(variable) + count);
        String finalString = "";
        for (String value : arrayList) {
            finalString += value;
        }
        System.out.println(finalString);
    }
}
