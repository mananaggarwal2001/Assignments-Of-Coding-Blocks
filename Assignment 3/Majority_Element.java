import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextInt();
        }
        int element = findMajorityElement(numberArray);
        System.out.println(element);
    }

    // Moore voting algorithm for finding the maximum occurrence of the element.
    public static int findMajorityElement(int[] numberArray) {
        int element = Integer.MIN_VALUE;
        int vote = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (vote == 0) {
                element = numberArray[i];
                vote = 1;
            }
            if (numberArray[i] == element) {
                vote++;
            } else {
                vote--;
            }
        }
        return element;
    }
}
