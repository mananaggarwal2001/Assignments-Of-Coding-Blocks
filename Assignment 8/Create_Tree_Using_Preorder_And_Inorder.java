import java.util.*;

public class Create_Tree_Using_Preorder_And_Inorder {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Create_Tree_Using_Preorder_And_Inorder m = new Create_Tree_Using_Preorder_And_Inorder();
        int n= scn.nextInt();
        int[] pre = takeInput(n);
        int[] in = takeInput(n);

        // Handling empty input case
        if (pre.length == 0 || in.length == 0) {
            System.out.println("Invalid input: Preorder and Inorder arrays cannot be empty.");
            return;
        }

        // Check if both arrays are of the same size
        if (pre.length != in.length) {
            System.out.println("Invalid input: Preorder and Inorder arrays must have the same length.");
            return;
        }

        BinaryTree bt = m.new BinaryTree(pre, in);
        bt.display();
    }

    public static int[] takeInput(int size) {
        if (size <= 0) {  // Prevents invalid array access
            return new int[0];
        }

        int[] rv = new int[size];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
                left = null;
                right = null;
            }
        }

        private Node root;

        public BinaryTree(int[] pre, int[] in) {
            this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }

        private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
            if (plo > phi || ilo > ihi) { // Base condition to stop recursion
                return null;
            }

            Node node = new Node(pre[plo]);
            int idx = findIndex(in, ilo, ihi, pre[plo]);

            // If element is not found in inorder array, return null (invalid case)
            if (idx == -1) {
                System.out.println("Error: Element " + pre[plo] + " not found in inorder array.");
                return null;
            }

            int leftTreeSize = idx - ilo;

            node.left = construct(pre, plo + 1, plo + leftTreeSize, in, ilo, idx - 1);
            node.right = construct(pre, plo + leftTreeSize + 1, phi, in, idx + 1, ihi);

            return node;
        }

        private int findIndex(int[] in, int si, int ei, int item) {
            for (int i = si; i <= ei; i++) {
                if (in[i] == item) {
                    return i;
                }
            }
            return -1; // Returns -1 if not found
        }

        public void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            if (node == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

    }
}
