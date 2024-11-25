import java.util.*;
public class The_Next_Permutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] numberArray = new int[N];
            for (int i = 0; i < N; i++) {
                numberArray[i] = sc.nextInt();
            }
            findNextPermute(numberArray);
            for (int i = 0; i < numberArray.length; i++) {
                System.out.print(numberArray[i] + " ");
            }
            System.out.println();
            T--;
        }
    }

    public static void findNextPermute(int[] numberArray) {
        // find the gola_index
        int gola_index = -1;
        for (int i = numberArray.length - 1; i > 0; i--) {
            if (numberArray[i - 1] < numberArray[i]) {
                gola_index = i - 1;
                break;
            }
        }

        // find the number which is just greater than the gola_index number.
        if (gola_index > -1) {
            int swap_index = gola_index;
            for (int i = numberArray.length - 1; i >= gola_index + 1; i--) {
                if (numberArray[i] > numberArray[gola_index]) {
                    swap_index = i;
                    break;
                }
            }
            // fir uske baad us number ko gola index waale number se swap kardo.
            int temp = numberArray[gola_index];
            numberArray[gola_index] = numberArray[swap_index];
            numberArray[swap_index] = temp;
        }
        // fir uske baad waale saare numbers ko reverse kardo
        reverseArray(numberArray, gola_index + 1);
    }

    public static void reverseArray(int[] numberArray, int index) {
        int i = index;
        int j = numberArray.length - 1;
        while (i <= j) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[j];
            numberArray[j] = temp;
            i++;
            j--;
        }
    }
}