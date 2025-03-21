import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ArrayList_Of_Levels {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList_Of_Levels m = new ArrayList_Of_Levels();
        BinaryTree bt1 = m.new BinaryTree();
        System.out.println(bt1.levelArrayList());
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

        public ArrayList<ArrayList<Integer>> levelArrayList() {
            ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                ArrayList<Integer> mainlist = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node removeNode = q.poll();
                    mainlist.add(removeNode.data);
                    if (removeNode.left != null) q.add(removeNode.left);
                    if (removeNode.right != null) q.add(removeNode.right);
                }
                newList.add(mainlist);
            }
            return newList;
        }
    }
}
