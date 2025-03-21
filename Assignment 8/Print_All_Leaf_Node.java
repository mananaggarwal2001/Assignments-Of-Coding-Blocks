import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_All_Leaf_Node {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rootValue = sc.nextInt();
        Node root = new Node(rootValue);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node nd = q.poll();
            int leftChild = sc.nextInt();
            int rightChild = sc.nextInt();
            if (leftChild != -1) {
                Node newNode = new Node(leftChild);
                nd.left = newNode;
                q.add(newNode);
            }
            if (rightChild != -1) {
                Node newNode = new Node(rightChild);
                nd.right = newNode;
                q.add(newNode);
            }
        }
        displayLeafNode(root);
    }

    public static void displayLeafNode(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.value + " ");
            return;
        }
        displayLeafNode(root.left);
        displayLeafNode(root.right);
    }
}
