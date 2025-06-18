import java.util.*;

public class Root_To_Leaf {
    private static Scanner scn = new Scanner(System.in);

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public Root_To_Leaf() {
        this.root = buildTree();
    }

    // Input format: data true/false true/false recursively
    private Node buildTree() {
        int data = scn.nextInt();
        Node node = new Node(data);

        boolean hasLeft = scn.nextBoolean();
        if (hasLeft) {
            node.left = buildTree();
        }

        boolean hasRight = scn.nextBoolean();
        if (hasRight) {
            node.right = buildTree();
        }

        return node;
    }

    public void rootToLeaf(int k) {
        printRootToLeaf(this.root, k, "");
    }

    private void printRootToLeaf(Node node, int k, String path) {
        if (node == null) return;

        k -= node.data;
        path += node.data + " ";

        if (node.left == null && node.right == null) {
            if (k == 0) {
                System.out.println(path);
            }
            return;
        }

        printRootToLeaf(node.left, k, path);
        printRootToLeaf(node.right, k, path);
    }

    public static void main(String[] args) {
        Root_To_Leaf tree = new Root_To_Leaf();
        int k = scn.nextInt();
        tree.rootToLeaf(k);
    }
}
