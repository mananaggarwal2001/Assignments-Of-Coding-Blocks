import java.util.Scanner;

public class Sum_of_two_Linked_Lists {
    static class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int count1 = 0;
        Node head1 = null;
        Node prev1 = null;
        Node head2 = null;
        Node prev2 = null;
        while (count1 < size1) {
            Node temp = new Node();
            temp.value = sc.nextInt();
            if (head1 == null) {
                head1 = temp;
                prev1 = temp;
            } else {
                prev1.next = temp;
                prev1 = temp;
            }
            count1++;
        }
        count1 = 0;
        while (count1 < size2) {
            Node temp = new Node();
            temp.value = sc.nextInt();
            if (head2 == null) {
                head2 = temp;
                prev2 = temp;
            } else {
                prev2.next = temp;
                prev2 = temp;
            }
            count1++;
        }
        Node finalAnswer = findAnswer(head1, head2);
        while (finalAnswer != null) {
            System.out.print(finalAnswer.value + " ");
            finalAnswer = finalAnswer.next;
        }
    }

    private static Node findAnswer(Node head1, Node head2) {
        int sum;
        int carry = 0;
        Node reversehead1 = reverseList(head1);
        Node reversehead2 = reverseList(head2);
        Node resultHead = null;
        Node resultPrev = null;
        while (reversehead1 != null && reversehead2 != null) {
            sum = reversehead1.value + reversehead2.value + carry;
            if (sum >= 10) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            Node temp = new Node();
            temp.value = sum;
            if (resultHead == null) {
                resultHead = temp;
                resultPrev = temp;
            } else {
                resultPrev.next = temp;
                resultPrev = temp;
            }
            reversehead1 = reversehead1.next;
            reversehead2 = reversehead2.next;
        }

        while (reversehead1 != null) {
            sum = reversehead1.value + carry;
            if (sum >= 10) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            Node temp = new Node();
            temp.value = sum;
            if (resultHead == null) {
                resultHead = temp;
                resultPrev = temp;
            } else {
                resultPrev.next = temp;
                resultPrev = temp;
            }
            reversehead1 = reversehead1.next;
        }
        while (reversehead2 != null) {
            sum = reversehead2.value + carry;
            if (sum >= 10) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            Node temp = new Node();
            temp.value = sum;
            if (resultHead == null) {
                resultHead = temp;
                resultPrev = temp;
            } else {
                resultPrev.next = temp;
                resultPrev = temp;
            }
            reversehead2 = reversehead2.next;
        }
        if (carry != 0) {
            Node temp = new Node();
            temp.value = carry;
            resultPrev.next = temp;
        }
        Node finalresulthead = reverseList(resultHead);
        return finalresulthead;
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
}
