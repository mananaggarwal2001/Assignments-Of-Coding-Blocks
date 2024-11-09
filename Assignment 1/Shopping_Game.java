import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test Cases:- ");
        int testCases = sc.nextInt();
        while (testCases > 0) {
            System.out.print("Enter the capacity of the Aayush:- ");
            int aayush = sc.nextInt();
            System.out.print("Enter the capacity of the Harshit");
            int harshit = sc.nextInt();
            String result = whoWillWin(aayush, harshit);
            System.out.println("The winner is :- " + result);
            testCases--;
        }
    }

    public static String whoWillWin(int aayush, int harshit) {
        int smartphone = 1;
        int aayushSum = 0;
        int harshitSum = 0;
        while (true) {
            aayushSum += smartphone;
            if (aayushSum > aayush) {
                return "Harshit";
            }
            smartphone++;
            harshitSum += smartphone;
            if (harshitSum > harshit) {
                return "Aayush";
            }
            smartphone++;
        }
    }
}
