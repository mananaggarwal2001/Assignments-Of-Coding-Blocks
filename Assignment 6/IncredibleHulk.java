import java.util.Scanner;

public class IncredibleHulk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number > 0) {
            int steps = sc.nextInt();
            int result = calculateSteps(steps);
            System.out.println(result);
            number--;
        }
    }


    private static int calculateSteps(int steps) {
        int count = 0;
        int k = 1;
        while (steps != 0) {
            while (k <= steps) {
                k <<= 1;
            }
            k >>= 1;
            steps -= k;
            k = 1;
            count++;
        }
        return count;
    }
}
