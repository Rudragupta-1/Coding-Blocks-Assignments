import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {
			if(node==null) {
                return new BalancedPair(0,true);
            }
                BalancedPair left=isBalanced(node.left);
                BalancedPair right=isBalanced(node.right);
                int height=1+Math.max(left.height,right.height);
                boolean isBalanced=left.isBalanced && right.isBalanced && Math.abs(left.height-right.height)<=1;
                return new BalancedPair(height,isBalanced);
            
			
		}
		private class BalancedPair {
			int height;
			boolean isBalanced;
            public BalancedPair(int height, boolean isBalanced) {
                this.height = height;
                this.isBalanced = isBalanced;
            }
		}

	}
}
