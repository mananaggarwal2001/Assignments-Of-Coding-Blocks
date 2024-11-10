import java.util.Scanner;

public class ChewBacca_And_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the minimum of the number:- ");
        long number = sc.nextLong();
        String numberString = String.valueOf(number);
        StringBuilder finalresult = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (i == 0 && numberString.charAt(i) - '0' == 9) {
                finalresult.append(numberString.charAt(i));
            } else {
                int flippedNumber = 9 - (numberString.charAt(i) - '0');
                if (numberString.charAt(i) - '0' < flippedNumber) {
                    finalresult.append(numberString.charAt(i));
                } else {
                    finalresult.append(flippedNumber);
                }
            }
        }
        System.out.println("The Minimum number of this string is:- " + finalresult);
    }
}
