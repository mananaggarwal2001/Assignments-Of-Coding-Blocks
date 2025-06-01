import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exist_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                map.put(array[i], map.getOrDefault(map.get(array[i]), 0) + 1);
            }
            int queries = sc.nextInt();
            while (queries > 0) {
                int element = sc.nextInt();
                if (map.containsKey(element)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                queries--;
            }
            testCases--;
        }
    }
}
