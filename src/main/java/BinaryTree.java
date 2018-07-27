
/*
 *     root
 *  left   right
 * left right
 */

class Node {

	int key;
	Node left;
	Node right;

	Node(int item) {
		key = item;
		left = right = null;
	}

}

public class BinaryTree {

	Node root;

	void printInOrder(Node node) {
		if(node==null)
			return;
		printInOrder(node.left);
		System.out.println(node.key);
		printInOrder(node.right);
	}
	
	void printpreOrder(Node node) {
		if(node==null)
			return;
		System.out.println(node.key);
		printInOrder(node.left);
		printInOrder(node.right);
	}

	void printPostOrder(Node node) {
		if(node==null)
			return;
		printInOrder(node.left);
		printInOrder(node.right);
		System.out.println(node.key);
	}
	
	public void printInorder() {
		printInOrder(root);
	}
}
