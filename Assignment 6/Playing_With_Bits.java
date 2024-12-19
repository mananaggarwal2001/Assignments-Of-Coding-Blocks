import java.util.Scanner;

public class Playing_With_Bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        while (query > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int result = countBits(n1, n2);
            System.out.println(result);
            query--;
        }
    }

    public static int countBits(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += resultBits(i);
        }
        return sum;
    }

    public static int resultBits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number & (number - 1);
        }
        return count;
    }
}
