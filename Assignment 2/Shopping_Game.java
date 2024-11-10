import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            int aayushCapacity = sc.nextInt();
            int harshitCapacity = sc.nextInt();
            String winner = purchasePhones(aayushCapacity, harshitCapacity);
            System.out.println(winner);
            testcase--;
        }
    }

    private static String purchasePhones(int aayushCapacity, int harshitCapacity) {
        int smartPhones = 1;
        int aayushSum = 0;
        int harshitSum = 0;
        while (true) {
            aayushSum += smartPhones;
            if (aayushSum > aayushCapacity) {
                return "Harshit";
            }
            smartPhones++;
            harshitSum += smartPhones;
            if (harshitSum > harshitCapacity) {
                return "Aayush";
            }
            smartPhones++;
        }
    }
}
