package trees;

public class PreOrderTraversal {
	
	public static void main(String[] args) {
		Node leftNode = new Node(new Node(null, null, 4), null, 5);
		Node rightNode = new Node(null, null, 9);
		Node root = new Node(leftNode, rightNode, 7);
		preOrderTraverse(root);
	}

	private static void preOrderTraverse(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.getValue());
		preOrderTraverse(n.getLeft());
		preOrderTraverse(n.getRight());
	}


}
