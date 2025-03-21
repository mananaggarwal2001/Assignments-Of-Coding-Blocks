import java.util.Scanner;

public class LL_K_Group {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node reverseKGroup(Node head, int k) {
        Node temp = head;
        Node prevNode = null;
        while (temp != null) {
            Node kthNode = findKthNode(temp, k);
            if (kthNode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverseFunction(temp);
            if (temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }

    public static void reverseFunction(Node temp) {
        Node current = temp;
        Node prev = null;
        while (current != null) {
            Node ahead = current.next;
            current.next = prev;
            prev = current;
            current = ahead;
        }
    }

    private static Node findKthNode(Node temp, int k) {
        Node kthNode = temp;
        int count = 1;
        while (kthNode != null && count != k) {
            kthNode = kthNode.next;
            count++;
        }
        return kthNode;
    }

    // Helper method to create a linked list from an array
    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Node head = createLinkedList(arr);
        head = reverseKGroup(head, K);
        printLinkedList(head);
    }
}
