import java.util.Scanner;

public class Triplet_From_Three_LinkedList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        Node head1 = null;
        Node temp1 = null;
        Node head2 = null;
        Node temp2 = null;
        Node head3 = null;
        Node temp3 = null;
        for (int i = 0; i < number1; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head1 == null) {
                head1 = newNode;
                temp1 = newNode;
            } else {
                temp1.next = newNode;
                temp1 = newNode;
            }
        }

        for (int i = 0; i < number2; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head2 == null) {
                head2 = newNode;
                temp2 = newNode;
            } else {
                temp2.next = newNode;
                temp2 = newNode;
            }
        }

        for (int i = 0; i < number3; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head3 == null) {
                head3 = newNode;
                temp3 = newNode;
            } else {
                temp3.next = newNode;
                temp3 = newNode;
            }
        }
        int target = sc.nextInt();
        int[] sumArray = calculateSum(head1, head2, head3, target);
        for (int result : sumArray) {
            System.out.print(result + " ");
        }
    }

    public static int[] calculateSum(Node head1, Node head2, Node head3, int target) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = head3;
        int[] finalresult = new int[3];
        while (temp1 != null) {
            temp2 = head2;
            while (temp2 != null) {
                temp3 = head3;
                while (temp3 != null) {
                    if ((temp1.value + temp2.value + temp3.value) == target) {
                        finalresult[0] = temp1.value;
                        finalresult[1] = temp2.value;
                        finalresult[2] = temp3.value;
                        return finalresult;
                    }
                    temp3 = temp3.next;
                }
                temp2 = temp2.next;
            }

            temp1 = temp1.next;
        }
        return null;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
