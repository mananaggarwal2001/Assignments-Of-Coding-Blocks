import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        tower(number, "A", "B", "C");
    }

    public static void tower(int number, String src, String dest, String hlp) {
        if (number == 0) {
            return;
        }
        tower(number - 1, src, hlp, dest);
        System.out.println("Moving ring " + number + " from " + src + " to " + dest);
        tower(number - 1, hlp, dest, src);
    }
}
