import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Scanner;

public class Board_Path_Count_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSizeBoards = sc.nextInt();
        int facesOfDie = sc.nextInt();
        int count = countPossiblitiesRecursion(numberOfSizeBoards, facesOfDie, "");
        System.out.println();
        System.out.println(count);
    }

    private static int countPossiblitiesRecursion(int numberOfSizeBoards, int facesOfDie, String ans) {
        if (numberOfSizeBoards == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        if (numberOfSizeBoards < 0) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i <= facesOfDie; i++) {
            result += countPossiblitiesRecursion(numberOfSizeBoards - i, facesOfDie, ans + i);
        }
        return result;
    }
}
