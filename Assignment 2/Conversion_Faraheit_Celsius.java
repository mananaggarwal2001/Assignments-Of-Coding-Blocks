import java.util.Scanner;

public class Conversion_Faraheit_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the min range:- ");
        int min = sc.nextInt();
        System.out.print("Enter the max range:- ");
        int max = sc.nextInt();
        System.out.print("Enter the number of steps:- ");
        int step = sc.nextInt();
        for (int i = min; i <= max; i += step) {
            double result = ((double) 5 / 9);
            int celsius = (int) (result * (i - 32));
            System.out.println("Celsius:- " + celsius);
            System.out.println("Fahrenheit:- " + i);
            System.out.println();
            System.out.println();
        }
    }
}
