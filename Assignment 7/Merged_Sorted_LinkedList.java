import java.util.Scanner;


public class Merged_Sorted_LinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l2 == null) {
            return l1;
        } else if (l1 == null) {
            return l2;
        }
        Node temp1 = l1;
        Node temp2 = l2;
        Node head = null;
        Node temp = null;
        while (temp1 != null && temp2 != null) {
            if (temp1.val >= temp2.val) {
                Node newNode = new Node(temp2.val);
                if (head == null) {
                    head = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = newNode;
                }
                temp2 = temp2.next;

            } else {
                Node newNode = new Node(temp1.val);
                if (head == null) {
                    head = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = newNode;
                }
                temp1 = temp1.next;
            }
        }
        if (temp1 == null) {
            temp.next = temp2;
        }
        if (temp2 == null) {
            temp.next = temp1;
        }
        return head;
    }

    public static Node createList(int[] values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values1 = new int[n];
        for (int i = 0; i < n; i++) {
            values1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] values2 = new int[m];
        for (int i = 0; i < m; i++) {
            values2[i] = scanner.nextInt();
        }

        Node l1 = createList(values1);
        Node l2 = createList(values2);

        Node merged = mergeTwoLists(l1, l2);
        printList(merged);
    }
}
