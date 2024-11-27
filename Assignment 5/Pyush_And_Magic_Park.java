import java.util.Scanner;

public class Pyush_And_Magic_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        char[][] park = new char[N][M];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }
        int result = checkEscape(park, K, S);
        if (result != -1) {
            System.out.println("Yes");
            System.out.println(result);
        } else {
            System.out.println("No");
        }
    }

    public static int checkEscape(char[][] park, int k, int s) {
        int strength = s;
        // edge case 1
        if (s < k) {
            return -1;
        }
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                if (park[i][j] == '.') {
                    strength -= 2;
                } else if (park[i][j] == '*') {
                    strength += 5;
                } else if (park[i][j] == '#') {
                    break;
                }
                if (j < park[0].length - 1) {
                    strength--;
                }
            }
        }
        return strength > k ? strength : -1;
    }
}
