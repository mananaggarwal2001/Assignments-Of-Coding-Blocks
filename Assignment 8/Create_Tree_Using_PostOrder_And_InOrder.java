import java.util.*;
public class Create_Tree_Using_PostOrder_And_InOrder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Create_Tree_Using_PostOrder_And_InOrder m = new Create_Tree_Using_PostOrder_And_InOrder();
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
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
			public Node(int data){
				this.data=data;
			}
		}

		private Node root;
		private int size;

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
			if(phi<plo || ilo>ihi){
				return null;	
			}
			Node nn = new Node(post[phi]); // root from postorder
    		int idx = search(post[phi], in, ilo, ihi); // index in inorder
    		int leftTreeSize = idx - ilo;

    		// Left Subtree: post[plo to plo+leftTreeSize-1], in[ilo to idx-1]
    		nn.left = construct(post, plo, plo + leftTreeSize - 1, in, ilo, idx - 1);

    		// Right Subtree: post[plo+leftTreeSize to phi-1], in[idx+1 to ihi]
    		nn.right = construct(post, plo + leftTreeSize, phi - 1, in, idx + 1, ihi);

    		return nn;
		}
		private int search(int element, int[] inorder, int ilo, int ihi){
			for(int i=ilo;i<=ihi;i++){
				if(element==inorder[i]){
					return i;
				}
			}
			return -1;
		}
		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
