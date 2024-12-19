import java.util.Scanner;

public class Replace_All_0_With_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String result = convertNumber(number, 0, "");
        System.out.println(result);
    }

    public static String convertNumber(String number, int index, String answer) {
        if (index == number.length()) {
            return answer;
        }
        if (number.charAt(index) != '0') {
            answer += number.charAt(index);
        } else {
            answer += 5;
        }
        return convertNumber(number, index + 1, answer);
    }
}
