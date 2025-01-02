import java.util.Scanner;

public class Rat_Chase_Its_Cheese {
    static boolean path = false;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        int[][] numberArray = new int[N][M];
        for (int i = 0; i < N; i++) {
            String inputString = sc.next();
            for (int j = 0; j < inputString.length(); j++) {
                board[i][j] = inputString.charAt(j);
            }
        }
        cheese(board, numberArray, 0, 0);
        if (!path) {
            System.out.println("NO PATH FOUND");
        }
        path = false;
        return;
    }

    public static void cheese(char[][] board, int[][] ans, int cr, int cc) {
        if (cr < 0 || cc < 0 || cr > board.length - 1 || cc > board[0].length - 1 || board[cr][cc] == 'X') {
            return;
        }
        if (cr == board.length - 1 && cc == board[0].length - 1) {
            ans[cr][cc] = 1;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            path = true;
            return;
        }
        board[cr][cc] = 'X';
        ans[cr][cc] = 1;
        cheese(board, ans, cr + 1, cc); // down direction
        cheese(board, ans, cr, cc + 1); // right direction
        cheese(board, ans, cr - 1, cc); // up direction
        cheese(board, ans, cr, cc - 1); // left direction.
        board[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
}
