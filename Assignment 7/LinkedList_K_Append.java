import java.util.Scanner;

public class LinkedList_K_Append {
    static class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Node head = null;
        Node previous = null;
        for (int i = 0; i < size; i++) {
            Node temp = new Node();
            temp.value = sc.nextInt();
            if (head == null) {
                head = temp;
                previous = temp;
            } else {
                previous.next = temp;
                previous = temp;
            }
        }
        int k = sc.nextInt();
        k %= size;
        Node result = null;
        if (k != 0) {
            result = resultList(head, k);
        } else {
            result = head;
        }
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

    private static Node resultList(Node head, int k) {
        Node reversehead = reverseList(head);
        Node destinationhead = reversehead;
        for (int i = 0; i < k; i++) {
            destinationhead = destinationhead.next;
        }
        Node finalhead = reverseList(reversehead, destinationhead);
        Node secondfinalhead = reverseList(destinationhead);
        Node finalresult = finalhead;
        while (finalhead.next != null) {
            finalhead = finalhead.next;
        }
        finalhead.next = secondfinalhead;
        return finalresult;
    }

    private static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node ahead = current.next;
            current.next = prev;
            prev = current;
            current = ahead;
        }
        return prev;
    }

    private static Node reverseList(Node start, Node end) {
        Node current = start;
        Node prev = null;
        while (current.next != end.next) {
            Node ahead = current.next;
            current.next = prev;
            prev = current;
            current = ahead;
        }
        return prev;
    }
}
