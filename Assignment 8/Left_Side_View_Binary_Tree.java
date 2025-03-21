import com.sun.source.tree.BinaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Left_Side_View_Binary_Tree {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        BinaryTree bt = new BinaryTree(arr);
        bt.leftView();
    }

    static class BinaryTree {
        static int max_depth = 0;

        private class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
            }
        }

        Node root;

        BinaryTree(String[] arr) {
            Queue<Node> queue = new LinkedList<Node>();
            construct(arr, 0, queue);
        }

        public void leftView() {
            leftView(this.root);
        }

        private void leftView(Node root) {
            leftSideViewResult(root, 1);

        }

        private void leftSideViewResult(Node root, int curr_depth) {
            if (root == null) {
                return;
            }
            if (curr_depth > max_depth && root.data != -1) {
                max_depth = curr_depth;
                System.out.print(root.data + " ");
            }
            leftSideViewResult(root.left, curr_depth + 1);
            leftSideViewResult(root.right, curr_depth + 1);
        }

        private void construct(String[] arr, int ind, Queue<Node> queue) {
            if (ind >= arr.length)
                return;
            if (queue.size() == 0) {
                Node nn = new Node(Integer.parseInt(arr[ind]));
                this.root = nn;
                queue.add(nn);
            } else {
                Node parent = queue.peek();
                if (parent.data != -1) {
                    if (parent.left == null) {
                        parent.left = new Node(Integer.parseInt(arr[ind]));
                        queue.add(parent.left);
                    } else {
                        if (parent.right == null) {
                            parent.right = new Node(Integer.parseInt(arr[ind]));
                            queue.add(parent.right);
                            queue.poll();
                        }
                    }
                } else {
                    queue.poll();
                    ind--;
                }
            }
            construct(arr, ind + 1, queue);
        }

        public void display() {
            display_tree(this.root);
        }

        private void display_tree(Node root) {
            if (root == null)
                return;
            String str = root.data + "";
            if (root.left != null) {
                str = root.left.data + " <= " + str;
            } else {
                str = "END <= " + str;
            }

            if (root.right != null) {
                str = str + " => " + root.right.data;
            } else {
                str = str + " => END";
            }
            System.out.println(str);
            display_tree(root.left);
            display_tree(root.right);

        }
    }
}
