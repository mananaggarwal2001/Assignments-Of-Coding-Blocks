import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int query = sc.nextInt();
        while (query > 0) {
            int amount = sc.nextInt();
            int k = sc.nextInt();
            boolean findNumberOfItems = costItems(array, amount, k);
            if (findNumberOfItems) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            query--;
        }
    }

    public static boolean costItems(int[] array, int amount, int k) {
        int numberkind = 0;
        for (int i = 0; i < array.length; i++) {
            if (amount % array[i] == 0) {
                numberkind++;
            }
        }
        return numberkind >= k;
    }
}
