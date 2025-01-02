public class PrintAllSubsets {
    public static void main(String[] args) {
        String number = "123";
        printSubsets(number, 0, "");
    }

    private static void printSubsets(String number, int index, String ans) {
        if (number.isEmpty()) {
            return;
        }
        System.out.println(ans);
        for (int i = index; i < number.length(); i++) {
            printSubsets(number, index + 1, ans + number.charAt(i));
        }
    }
}
