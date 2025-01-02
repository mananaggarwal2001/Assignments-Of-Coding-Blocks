import java.util.Scanner;

public class Count_Set_Bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int number = sc.nextInt();
            int bitsCount = countSetBits(number);
            System.out.println(bitsCount);
            test--;
        }
    }

    public static int countSetBits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number & (number - 1);
        }
        return count;
    }
}
