import java.util.ArrayList;
import java.util.Scanner;
public class Odd_Even_In_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Node head = null;
        Node temp = null;
        for (int i = 0; i < number; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        findTheElement(head);
    }

    public static void findTheElement(Node head) {
        ArrayList<Integer> array = new ArrayList<>();
        Node even = head;
        Node odd = head;
        while (odd != null) {
            if (odd.value % 2 != 0) {
                array.add(odd.value);
            }
            odd = odd.next;
        }

        while (even != null) {
            if (even.value % 2 == 0) {
                array.add(even.value);
            }
            even = even.next;
        }
        for (int result : array) {
            System.out.print(result + " ");
        }
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
