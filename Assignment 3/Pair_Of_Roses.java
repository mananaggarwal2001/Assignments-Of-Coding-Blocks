import java.util.Arrays;
import java.util.Scanner;

public class Pair_Of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            int[] roseArray = new int[size];
            for (int i = 0; i < roseArray.length; i++) {
                roseArray[i] = sc.nextInt();
            }
            int deepakMoney = sc.nextInt();
            Arrays.sort(roseArray);
            findPairOfRoses(roseArray, deepakMoney);
            testCases--;
        }
    }

    public static void findPairOfRoses(int[] roseArray, int deepakMoney) {
        int price1 = 0;
        int price2 = 0;
        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < roseArray.length - 1; i++) {
            for (int j = i + 1; j < roseArray.length; j++) {
                if (roseArray[i] + roseArray[j] == deepakMoney) {
                    if (difference > roseArray[j] - roseArray[i]) {
                        difference = roseArray[j] - roseArray[i];
                        price1 = roseArray[i];
                        price2 = roseArray[j];
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + price1 + " and " + price2 + ".");
    }
}
