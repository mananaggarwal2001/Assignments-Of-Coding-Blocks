import java.util.Scanner;

public class String_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char variable = stringmaxfrequency(s);
        System.out.println(variable);
    }

    public static char stringmaxfrequency(String s) {
        char variable = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                variable = s.charAt(i);
                count = 1;
            }
            if (s.charAt(i) == variable) {
                count++;
            } else {
                count--;
            }
        }
        return variable;
    }
}
