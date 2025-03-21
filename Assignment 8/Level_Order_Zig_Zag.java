import com.sun.tools.javac.Main;

import java.util.*;

public class Level_Order_Zig_Zag {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Level_Order_Zig_Zag m = new Level_Order_Zig_Zag();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ() {
            Queue<Node> q = new LinkedList<>();
            int count = 1;
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> ll = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node removedNode = q.poll();
                    ll.add(removedNode.data);
                    if (removedNode.left != null)
                        q.add(removedNode.left);
                    if (removedNode.right != null)
                        q.add(removedNode.right);
                }
                if (count % 2 == 0) {
                    Collections.reverse(ll);
                }
                for (int ans : ll) {
                    System.out.print(ans + " ");
                }
                count++;
            }
        }
    }
}
