import java.util.Scanner;

public class KunalClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordString = sc.nextLine();
        if (wordString.length() > 5) {
            System.out.println("Error");
        } else {
            System.out.println(wordString.length());
        }
    }
}
