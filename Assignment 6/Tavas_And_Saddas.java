import java.util.Scanner;

public class Tavas_And_Saddas {
    public static void main(String[] args) {
        // find the lucky number.
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(index(inputString));
    }

    public static int index(String inputString) {
        int number = inputString.length();
        int count = (1 << number) - 2;// n-1 length of the number.
        int position = 0;
        int sum = 0;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (inputString.charAt(i) == '7') {
                sum += (1 << position);
            }
            position++;
        }
        return count + sum + 1;
    }
}
