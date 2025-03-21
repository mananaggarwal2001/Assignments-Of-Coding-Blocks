import java.util.Scanner;

public class Kth_element_from_last_in_linked_list {
    static class ListNode {
        int value;
        ListNode next;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ListNode head = null;
        ListNode track = null;
        while (true) {
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }
            ListNode temp = new ListNode();
            temp.value = input;
            if (head == null) {
                head = temp;
                track = temp;
            } else {
                track.next = temp;
                track = temp;
            }
        }
        int tofindvalue = sc.nextInt();
        ListNode reversehead = reverseList(head);
        int finalvalue = findvalue(reversehead, tofindvalue);
        System.out.println(finalvalue);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    public static int findvalue(ListNode reversehead, int tofindvalue) {
        for (int i = 1; i < tofindvalue; i++) {
            reversehead = reversehead.next;
        }
        return reversehead.value;
    }
}
