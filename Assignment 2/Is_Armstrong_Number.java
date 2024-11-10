import java.util.Scanner;
public class Is_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        boolean armstrongNumber = is_ArmStrong(number);
        if (armstrongNumber) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean is_ArmStrong(long number) {
        int countDigits = String.valueOf(number).length();
        long sum = 0;
        long count_Digits = number;
        while (count_Digits > 0) {
            long remainder = count_Digits % 10;
            sum += (long) Math.pow(remainder, countDigits);
            count_Digits /= 10;
        }
        return sum == number;
    }
}