import java.util.Scanner;

public class Conversion_Any_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source_base = sc.nextInt();
        int destination_base = sc.nextInt();
        int number_in_source_format = sc.nextInt();
        int source_to_decimal_conversion = source_to_destination_Converter(source_base, 10, number_in_source_format);
        int finalresult= source_to_destination_Converter(10, destination_base, source_to_decimal_conversion);
        System.out.println(finalresult);
    }
    private static int source_to_destination_Converter(int sourceBase, int destinationBase, int sourceNumber) {
        int number = sourceNumber;
        int finalresult = 0;
        int power = 0;
        while (number > 0) {
            int remainder = number % destinationBase;
            finalresult += (int) (Math.pow(sourceBase, power) * remainder);
            number /= destinationBase;
            power++;
        }
        return finalresult;
    }
}
