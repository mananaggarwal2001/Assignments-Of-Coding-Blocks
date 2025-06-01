import java.util.*;

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] arr1 = new int[numberOfElements];
        int[] arr2 = new int[numberOfElements];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = intersectOfTwoArrays(arr1, arr2);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    private static int[] intersectOfTwoArrays(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr2[i])) {
                result.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
                if (map.get(arr2[i]) == 0) {
                    map.remove(arr2[i]);
                }
            }
        }
        int[] finalresult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalresult[i] = result.get(i);
        }
        return finalresult;
    }

}
