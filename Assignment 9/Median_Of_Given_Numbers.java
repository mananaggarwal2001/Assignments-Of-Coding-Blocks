import java.util.*;

public class Median_Of_Given_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < size; i++) {
                int inputValue = sc.nextInt();
                set.add(inputValue);
                int result = findMedian(set);
                System.out.print(result + " ");
            }
            System.out.println();
            testCases--;
        }
    }

    private static int findMedian(TreeSet<Integer> set) {
        if ((set.size() & 1) == 0) {
            int median = set.size() / 2;
            int nextValue = median + 1;
            int firstValue = 0, secondValue = 0;
            for (int value : set) {
                firstValue = value;
                median--;
                if (median == 0) {
                    break;
                }
            }
            for (int value : set) {
                secondValue = value;
                nextValue--;
                if (nextValue == 0) {
                    break;
                }
            }
            return (firstValue + secondValue) / 2;
        } else {
            int median = (set.size() / 2) + 1;
            int firstValue = 0;
            for (int value : set) {
                firstValue = value;
                median--;
                if (median == 0) {
                    break;
                }
            }
            return firstValue;
        }
    }
}
