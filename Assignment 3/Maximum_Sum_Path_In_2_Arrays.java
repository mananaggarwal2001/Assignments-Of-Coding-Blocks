import java.util.Scanner;

public class Maximum_Sum_Path_In_2_Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] n1 = new int[n];
            int[] m1 = new int[m];
            for (int i = 0; i < n; i++) {
                n1[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                m1[i] = sc.nextInt();
            }
            int result = checkSum(n1, m1);
            System.out.println(result);
            t--;
        }
    }

    public static int checkSum(int[] n1, int[] m1) {
        int result = 0;
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        int j = 0;
        // checking portion which element in this array is big element and then do the work.
        while (i < n1.length && j < m1.length) {
            if (n1[i] > m1[j]) {
                sum2 += m1[j];
                j++;
            } else if (n1[i] < m1[j]) {
                sum1 += n1[i];
                i++;
            } else if (n1[i] == m1[j]) {
                result += Math.max(sum1, sum2);
                result += n1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // for remanining array we will do this work.
        // if any of the array is remaining then we will do this.
        while (i < n1.length) {
            sum1 += n1[i];
            i++;
        }
        while (j < m1.length) {
            sum2 += m1[j];
            j++;
        }
        result += Math.max(sum1, sum2);
        return result;
    }
}
