import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Merge_K_Sorted_List {
    static class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        List<Node> arrayList = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            Node head = null;
            Node temp = null;
            for (int j = 0; j < N; j++) {
                int inputValue = sc.nextInt();
                Node currentNode = new Node();
                currentNode.value = inputValue;
                if (head == null) {
                    head = currentNode;
                    temp = currentNode;
                } else {
                    temp.next = currentNode;
                    temp = currentNode;
                }
            }
            arrayList.add(head);
        }
        Node resulthead = mergeSortedLinkedList(arrayList);
        while (resulthead != null) {
            System.out.print(resulthead.value + " ");
            resulthead = resulthead.next;
        }
    }

    private static Node mergeSortedLinkedList(List<Node> arrayList) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> {
            return a.value - b.value;
        });
        for (Node n : arrayList) {
            pq.add(n);
        }
        Node resulthead = null;
        Node resulttemp = null;
        while (!pq.isEmpty()) {
            Node temp = pq.remove();
            Node newNode = temp;
            if (resulthead == null) {
                resulthead = newNode;
                resulttemp = newNode;
            } else {
                resulttemp.next = temp;
                resulttemp = temp;
            }
            if (temp.next != null) {
                pq.add(temp.next);
            }
        }
        return resulthead;
    }
}
