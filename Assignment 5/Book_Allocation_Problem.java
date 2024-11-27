import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int number = sc.nextInt();
            int students = sc.nextInt();
            int[] books = new int[number];
            for (int i = 0; i < books.length; i++) {
                books[i] = sc.nextInt();
            }
            int result = checkPages(books, students);
            System.out.println(result);
            t--;
        }
    }

    private static int checkPages(int[] books, int students) {
        int low = 0;
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i];
        }
        int high = sum;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isItPossible(mid, books, students)) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int mid, int[] books, int students) {
        int assignStudents = 1;
        int sum = 0;
        for (int i = 0; i < books.length; ) {
            if (sum + books[i] <= mid) {
                sum += books[i];
                i++;
            } else {
                sum = 0;
                assignStudents++;
            }
            if (assignStudents > students) {
                return true;
            }
        }
        return false;
    }
}
