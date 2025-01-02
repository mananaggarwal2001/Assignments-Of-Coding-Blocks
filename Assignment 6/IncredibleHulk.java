import java.util.Scanner;

public class IncredibleHulk {
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number > 0) {
            int steps = sc.nextInt();
            calculateSteps(steps, 0);
            System.out.println(result);
            result = Integer.MAX_VALUE;
            number--;
        }
    }


    private static void calculateSteps(int number, int steps) {
        if (number == 0) {
            result = Math.min(result, steps);
            return;
        }
        for (int i = 0; i <= number; i++) {
            calculateSteps((int) (number - Math.pow(2, i)), steps + 1);
        }
    }
}
