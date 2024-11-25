import java.util.Scanner;

public class Nobita_Score_Good_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        while (query > 0) {
            int candies = sc.nextInt();
            int children = sc.nextInt();
            int result = checkCandies(candies, children);
            System.out.println(result);
            query--;
        }
    }

    public static int checkCandies(int candies, int children) {
        int remainder = candies % children;
        int remainingChildren = Math.abs(remainder - children);
        return Math.min(remainder, remainingChildren);
    }
}
