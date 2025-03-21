import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Right_Side_View {
    static int max_depth = 0;

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // input taking in the binary tree.
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        Node root = new Node(inputValue);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node removeNode = q.poll();
            int firstChild = sc.nextInt();
            int secondChild = sc.nextInt();
            if (firstChild != -1) {
                Node newNode = new Node(firstChild);
                q.add(newNode);
                removeNode.left = newNode;
            }
            if (secondChild != -1) {
                Node newNode = new Node(secondChild);
                q.add(newNode);
                removeNode.right = newNode;
            }
        }
        printRightSide(root, 1);
    }

    public static void printRightSide(Node root, int current_depth) {
        if (root == null) {
            return;
        }
        if (current_depth > max_depth) {
            System.out.print(root.value + " ");
            max_depth = current_depth;
        }
        printRightSide(root.right, current_depth + 1);
        printRightSide(root.left, current_depth + 1);
    }
}
