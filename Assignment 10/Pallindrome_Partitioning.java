import java.util.*;

public class Pallindrome_Partitioning {
    // Function to return all palindromic partitions of a given string
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        pallindromePartitioning(s, ans, temp);
        return ans;
    }

    public static void pallindromePartitioning(String s, List<List<String>> ans, List<String> temp) {
        if (s.isEmpty()) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String ansString = s.substring(0, i);
            if (isPallindrome(ansString)) {
                temp.add(ansString);
                String questionString = s.substring(i);
                pallindromePartitioning(questionString, ans, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static boolean isPallindrome(String ans) {
        int i = 0;
        int j = ans.length() - 1;
        while (i < j) {
            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        List<List<String>> ans = partition(s);

        System.out.print("[");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print("\"" + ans.get(i).get(j) + "\"");
                if (j != ans.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i != ans.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        sc.close();
    }
}
