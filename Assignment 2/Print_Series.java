import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:- ");
        int number = sc.nextInt();
        System.out.print("Enter the second number:- ");
        int secondNumber = sc.nextInt();
        int count = 0;
        int tracker = 1;
        while (true) {
            int termNumber = 3 * tracker + 2;
            if(termNumber%secondNumber!=0){
                System.out.println(termNumber);
                count++;
            }
            tracker++;
            if (count == number) {
                break;
            }
        }
    }
}
