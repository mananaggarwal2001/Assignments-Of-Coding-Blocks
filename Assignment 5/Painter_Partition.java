import java.util.Scanner;

public class Painter_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int painters = sc.nextInt();
        int number = sc.nextInt();
        int[] boardsArray = new int[number];
        for (int i = 0; i < boardsArray.length; i++) {
            boardsArray[i] = sc.nextInt();
        }
        int time = checkpaintedBoards(boardsArray, painters);
        System.out.println(time);
    }

    private static int checkpaintedBoards(int[] boardsArray, int painters) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < boardsArray.length; i++) {
            if (boardsArray[i] > maxValue) {
                maxValue = boardsArray[i];
            }
            sum += boardsArray[i];
        }
        int low = maxValue;
        int high = sum;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isItPossible(mid, boardsArray, painters)) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    // maxlength is the length of the one person for which they will paint the board.
    public static boolean isItPossible(int maxLength, int[] boardArray, int painters) {
        // initials for the board and painters
        int total = 0;
        int paint = 1;
        for (int i = 0; i < boardArray.length; i++) {
            total += boardArray[i];
            if (total > maxLength) {
                total = boardArray[i];
                paint++;
            }
        }
        return paint > painters;
    }
}
