import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Can_You_Read_This {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        canyouread(s);
    }

    public static void canyouread(String s) {
        s = s.trim();
        String[] wordString = s.split("[A-Z]");
        int position = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                wordString[position] = wordString[position].replaceFirst("", String.valueOf(s.charAt(i)));
                wordString[position] = wordString[position].trim();
                position++;
            }
        }
        for (int i = 1; i < wordString.length; i++) {
            System.out.println(wordString[i]);
        }
    }
}
